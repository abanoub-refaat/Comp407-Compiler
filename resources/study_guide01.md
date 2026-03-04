# ANTLR3 Practice Exercises

> Try to solve each exercise before looking at the answer. The answers are at the bottom of the file.

---

## Level 1 — Declarations

**Exercise 1**
Write a rule for: `int x;` or `int x = 5;` (single variable, optional init)

**Exercise 2**
Write a rule for: `int x, y, z;` (multiple variables, no init)

**Exercise 3**
Write a rule for: `int x = 1, y, z = 3;` (multiple variables, mixed optional init)

**Exercise 4**
What is wrong with this rule?

```antlr
dec: Int_type (ID '=' INT | ID ',')+ ';';
```

---

## Level 2 — Arithmetic

**Exercise 5**
Write the three rules (`expr`, `term`, `factor`) that handle arithmetic with correct precedence for `+`, `-`, `*`, `/`.

**Exercise 6**
Trace the parse tree for: `x = 2 + 3 * 4;`
Which operation is resolved first and why?

**Exercise 7**
What is wrong with this rule?

```antlr
expr: expr '+' term | term;
```

---

## Level 3 — Boolean

**Exercise 8**
Write the rules for a boolean expression supporting `||`, `&&`, and comparison operators (`>`, `<`, `==`, `!=`).

**Exercise 9**
What is wrong with this rule?

```antlr
boolFactor: INT | ID | '(' boolExpr ')';
```

**Exercise 10**
Why does `boolFactor` use `expr` on both sides instead of just `INT | ID`?

---

## Level 4 — Control Flow

**Exercise 11**
Write a rule for: `while (cond) { stmts }`

**Exercise 12**
Write a rule for: `do { stmts } while (cond);`
What is the difference between this and reusing `while_`?

**Exercise 13**
Write an `if` rule that supports `else if` chaining and an optional `else`.

**Exercise 14**
Write the `stmt` rule that ties all statement types together.

---

## Level 5 — Mixed / Challenge

**Exercise 15**
Write a full lexer for a language that has: identifiers, integers, floats (`1.5`, `3.0`), and whitespace.

**Exercise 16**
Write a rule for a function call: `foo(x, 3, y + 1);`

**Exercise 17**
Write a rule for a `for` loop: `for (int i = 0; i < 10; i = i + 1) { stmt* }`

**Exercise 18**
Write a rule for `double` declarations with optional initialization: `double x = 1.5, y, z = 3.0;`

---

## Theory Questions

**Q1:** What is the difference between a lexer rule and a parser rule in ANTLR3?

**Q2:** Why must keyword rules like `Int_type: 'int'` be defined before `ID`?

**Q3:** What is left recursion? Give an example and its fix.

**Q4:** What does `skip()` do and why is it used on `WS`?

**Q5:** What is the difference between `*`, `+`, and `?`?

**Q6:** How does ANTLR3 enforce operator precedence?

**Q7:** Why can't `do_` reuse the `while_` rule directly?

---

---

# Answers

## Level 1

**Exercise 1**

```antlr
dec: Int_type ID ('=' INT)? ';';
// or equivalently:
dec: Int_type ID ('=' INT ';' | ';');
```

**Exercise 2**

```antlr
dec2: Int_type ID (',' ID)* ';';
```

**Exercise 3**

```antlr
dec3: Int_type ID ('=' INT)? (',' ID ('=' INT)?)* ';';
```

**Exercise 4**
Two problems:

- The last variable before `;` has no `,` or `'=' INT` after it, so it would fail
- Both alternatives start with `ID` causing ambiguity
  Fix: use `ID ('=' INT)?` as a single entry and repeat with commas.

---

## Level 2

**Exercise 5**

```antlr
expr  : term   (('+' | '-') term)*;
term  : factor (('*' | '/') factor)*;
factor: INT | ID | '(' expr ')';
```

**Exercise 6**
`3 * 4` is resolved first because `*` lives in `term`, which is nested deeper than `expr`. The parse tree is:

```
expr
├── term(2)
├── '+'
└── term
    ├── factor(3)
    ├── '*'
    └── factor(4)
```

Result: `2 + (3 * 4) = 14` ✅

**Exercise 7**
This is **left recursion** — `expr` starts with itself. ANTLR3 uses top-down parsing and cannot handle this (causes infinite recursion).
Fix: `expr: term ('+' term)*;`

---

## Level 3

**Exercise 8**

```antlr
boolExpr  : boolTerm  ('||' boolTerm)*;
boolTerm  : boolFactor ('&&' boolFactor)*;
boolFactor: expr BOPR expr | '(' boolExpr ')';
```

**Exercise 9**
`boolFactor` accepts only raw `INT` or `ID`, so comparisons like `x > 3` or `a == 5` would fail. It needs `expr BOPR expr` to handle comparisons.

**Exercise 10**
Because the things being compared are arithmetic expressions, not just literals. `x + 1 > y * 2` should be valid — both sides need the full power of `expr`.

---

## Level 4

**Exercise 11**

```antlr
while_: 'while' '(' boolExpr ')' '{' stmt* '}';
```

**Exercise 12**

```antlr
do_: 'do' '{' stmt* '}' 'while' '(' boolExpr ')' ';';
```

`do_` cannot reuse `while_` because `while_` includes a body `{ stmt* }`. In `do_`, the body comes before the condition, and the condition part is just `'while' '(' boolExpr ')' ';'` — no body.

**Exercise 13**

```antlr
if_: 'if' '(' boolExpr ')' '{' stmt* '}'
     ('else' 'if' '(' boolExpr ')' '{' stmt* '}')*
     ('else' '{' stmt* '}')?;
```

**Exercise 14**

```antlr
stmt: dec | dec2 | dec3 | dec4 | dec5 | if_ | while_ | do_;
```

---

## Level 5

**Exercise 15**

```antlr
ID     : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
INT    : ('0'..'9')+;
DOUBLE : INT '.' INT;
WS     : (' ' | '\t' | '\n' | '\r') { skip(); };
```

**Exercise 16**

```antlr
funcCall: ID '(' (expr (',' expr)*)? ')' ';';
```

**Exercise 17**

```antlr
for_: 'for' '(' dec4 boolExpr ';' ID '=' expr ')' '{' stmt* '}';
// or more generally:
for_: 'for' '(' dec expr ';' ID '=' expr ')' '{' stmt* '}';
```

**Exercise 18**

```antlr
dec6: Double_type ID ('=' DOUBLE)? (',' ID ('=' DOUBLE)?)* ';';
```

---

## Theory Answers

**Q1:** Lexer rules (UPPERCASE) match sequences of characters and produce tokens. Parser rules (lowercase) match sequences of tokens and build grammatical structure.

**Q2:** ANTLR3 resolves lexer ambiguity by order of definition. If `ID` comes first, the word `int` would be tokenized as an identifier instead of a keyword.

**Q3:** A rule is left-recursive when its first alternative starts with itself, e.g. `expr: expr '+' term`. This causes infinite recursion in top-down parsers. Fix: use iteration — `expr: term ('+' term)*`.

**Q4:** `skip()` tells ANTLR3 to discard a token instead of passing it to the parser. Without it, every space would be a token and you'd need to explicitly allow whitespace between every element in your grammar.

**Q5:** `*` = zero or more, `+` = one or more, `?` = zero or one (optional).

**Q6:** By splitting expressions into layered rules. Higher-precedence operators go in rules nested deeper in the hierarchy. The parser resolves deeper rules first, naturally giving them higher precedence.

**Q7:** `while_` includes a body `{ stmt* }`. The `do_` loop's body comes before the condition, and its condition part is just `'while' '(' boolExpr ')' ';'` with no body — reusing `while_` would add an unwanted second body.
