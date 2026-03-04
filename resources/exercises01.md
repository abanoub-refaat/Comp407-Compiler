# ANTLR3 Complete Study Guide

## What is ANTLR3?

ANTLR (Another Tool for Language Recognition) is a parser generator. You write a **grammar file** and ANTLR generates a lexer and parser for you. In ANTLR3, the grammar file has the `.g` extension.

A basic grammar file structure:

```antlr
grammar MyLanguage;

// Parser rules (lowercase)
program : stmt* EOF;

// Lexer rules (UPPERCASE)
ID  : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;
INT : ('0'..'9')+;
WS  : (' ' | '\t' | '\n' | '\r') { skip(); };
```

---

## 1. Lexer Rules vs Parser Rules

|          | Lexer Rules                   | Parser Rules                 |
| -------- | ----------------------------- | ---------------------------- |
| Naming   | UPPERCASE                     | lowercase                    |
| Purpose  | Recognize characters → tokens | Recognize tokens → structure |
| Examples | `ID`, `INT`, `WS`             | `expr`, `stmt`, `dec`        |

The lexer runs first, converting raw characters into a token stream. The parser then reads that token stream.

### Common Lexer Rules

```antlr
Int_type : 'int';
ID       : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
INT      : ('0'..'9')+;
DOUBLE   : INT '.' INT;
BOPR     : '<' | '>' | '<=' | '>=' | '==' | '!=' | '<>';
WS       : (' ' | '\t' | '\n' | '\r' | '\r\n') { skip(); };
```

> ⚠️ **Token order matters!** Keywords like `Int_type: 'int'` must be defined **before** `ID`, otherwise `int` gets matched as an identifier.

---

## 2. Quantifiers

| Symbol | Meaning                | Example                            |
| ------ | ---------------------- | ---------------------------------- |
| `*`    | Zero or more           | `stmt*` → 0 or more statements     |
| `+`    | One or more            | `('0'..'9')+` → at least one digit |
| `?`    | Zero or one (optional) | `('=' INT)?` → optional assignment |

### Example — optional initialization

```antlr
// int x;  OR  int x = 5;
dec: Int_type ID ('=' INT)? ';';
```

---

## 3. Alternation and Grouping

`|` means OR, parentheses group alternatives:

```antlr
// int x;  OR  int x = 5;
dec: Int_type ID ('=' INT ';' | ';');

// INT or ID or parenthesized expression
factor: INT | ID | '(' expr ')';
```

---

## 4. Repetition with Commas

A very common pattern — one item followed by zero or more comma-separated items:

```antlr
// int x, y, z;
dec2: Int_type ID (',' ID)* ';';
```

Combining with optional initialization:

```antlr
// int x = 1, y, z = 3;
dec3: Int_type ID ('=' INT)? (',' ID ('=' INT)?)* ';';
```

> **Note:** `dec3` generalizes `dec` and `dec2` — it handles all cases: no init, full init, and mixed init.

---

## 5. Operator Precedence

ANTLR3 does **not** handle precedence automatically. You enforce it by **splitting into layered rules**, where higher-precedence operators are nested deeper.

### The Three-Level Pattern for Arithmetic

```antlr
expr  : term   (('+' | '-') term)*;    // lowest precedence
term  : factor (('*' | '/') factor)*;  // higher precedence
factor: INT | ID | '(' expr ')';       // highest (atomic values)
```

**Why this works:** `3 + 4 * 2` parses as `3 + (4 * 2)` because `4 * 2` is fully resolved inside `term` before `+` is handled in `expr`.

Parse tree for `3 + 4 * 2`:

```
expr
├── term(3)
├── '+'
└── term
    ├── factor(4)
    ├── '*'
    └── factor(2)
```

Arithmetic assignment rule:

```antlr
dec4: ID '=' expr ';';
```

---

## 6. Left Recursion

ANTLR3 uses **top-down (LL) parsing** and **cannot** handle left-recursive rules.

```antlr
// ❌ Left recursive — causes infinite recursion
expr: expr '+' term | term;

// ✅ Correct — use iteration instead
expr: term ('+' term)*;
```

A rule is left-recursive when its first alternative starts with itself.

---

## 7. Boolean Expressions

Boolean expressions follow the same layered precedence pattern:

```
||   →  lowest
&&   →  higher
comparisons (>, <, ==, !=)  →  highest
```

```antlr
dec5      : ID '=' boolExpr ';';
boolExpr  : boolTerm  ('||' boolTerm)*;
boolTerm  : boolFactor ('&&' boolFactor)*;
boolFactor: expr BOPR expr | '(' boolExpr ')';
```

> **Key insight:** `boolFactor` uses `expr` on both sides — this connects the boolean layer **on top of** the arithmetic layer.

### Full Precedence Chain

```
boolExpr    (||)
  boolTerm  (&&)
    boolFactor  (comparisons)
      expr      (+, -)
        term    (*, /)
          factor  (INT, ID, parentheses)
```

---

## 8. Control Flow

Control flow rules use `stmt*` in their bodies, making them **recursive** — you can freely nest if/while inside each other.

```antlr
if_   : 'if' '(' boolExpr ')' '{' stmt* '}'
        ('else' 'if' '(' boolExpr ')' '{' stmt* '}')*
        ('else' '{' stmt* '}')?;

while_: 'while' '(' boolExpr ')' '{' stmt* '}';

do_   : 'do' '{' stmt* '}' 'while' '(' boolExpr ')' ';';

stmt  : dec | dec2 | dec3 | dec4 | dec5 | if_ | while_ | do_;
```

> ⚠️ `do_` ends with `'while' '(' boolExpr ')' ';'` — not a reuse of `while_` (which includes a body `{}`).

---

## 9. Full Grammar Reference

```antlr
grammar intro;

// Types
Int_type    : 'int';
Double_type : 'double';

// Tokens
ID     : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
INT    : ('0'..'9')+;
DOUBLE : INT '.' INT;
BOPR   : '<' | '>' | '<=' | '>=' | '==' | '!=' | '<>';
WS     : (' ' | '\t' | '\n' | '\r' | '\r\n') { skip(); };

// Declarations
dec  : Int_type ID ('=' INT ';' | ';');
dec2 : Int_type ID (',' ID)* ';';
dec3 : Int_type ID ('=' INT)? (',' ID ('=' INT)?)* ';';

// Arithmetic
dec4  : ID '=' expr ';';
expr  : term (('+' | '-') term)*;
term  : factor (('*' | '/') factor)*;
factor: INT | ID | '(' expr ')';

// Boolean
dec5      : ID '=' boolExpr ';';
boolExpr  : boolTerm ('||' boolTerm)*;
boolTerm  : boolFactor ('&&' boolFactor)*;
boolFactor: expr BOPR expr | '(' boolExpr ')';

// Control Flow
if_   : 'if' '(' boolExpr ')' '{' stmt* '}'
        ('else' 'if' '(' boolExpr ')' '{' stmt* '}')*
        ('else' '{' stmt* '}')?;
while_: 'while' '(' boolExpr ')' '{' stmt* '}';
do_   : 'do' '{' stmt* '}' 'while' '(' boolExpr ')' ';';
stmt  : dec | dec2 | dec3 | dec4 | dec5 | if_ | while_ | do_;
```

---

## 10. Common Mistakes

| Mistake                               | Fix                                          |
| ------------------------------------- | -------------------------------------------- |
| Left recursion: `expr: expr '+' term` | Use iteration: `expr: term ('+' term)*`      |
| Missing `?` for optional parts        | Add `?` after any optional group             |
| `boolFactor` without comparisons      | Use `expr BOPR expr`, not just `INT \| ID`   |
| `do_` reusing `while_` rule           | `do_` ends with condition only, no `{}` body |
| `stmt` missing some rules             | Always include all statement types in `stmt` |
| Keywords defined after `ID`           | Always define keywords before `ID`           |
