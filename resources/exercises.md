# Compilation Exercises: Lab Series 01-03

This file contains exercises of varying difficulty levels covering the concepts introduced in Labs 01, 02, and 03.

---

## 🟢 Easy (Basic Lexing & Simple Rules)

**Topics:** Lexer rules, basic token matching, simple grammar structure.

### 1. Simple Identifiers

Modify a grammar to support identifiers that **cannot** start with an underscore (`_`), only letters.

- **Input Examples:** `var1`, `test_case`, `A1`
- **Invalid Examples:** `_hidden`, `1var`

### 2. Basic Arithmetic Tokens

Add lexer rules to a grammar for:

- Multiplication (`*`) and Division (`/`).
- Ensure whitespace between operators is ignored using `{ skip(); }`.

### 3. Float Support

Create a lexer rule `FLOAT` that matches numbers like `3.14`, `.5`, and `2.`.

- _Hint:_ Use optional parts in your rule.

---

## 🟡 Medium (Grammar Logic & Actions)

**Topics:** Alternative rules, simple actions, condition logic.

### 4. Constant Declarations

Expand a grammar to support `final` or `const` declarations.

- **Rule:** `const int x = 5;`
- **Requirement:** The `const` keyword should be optional in the rule.

### 5. Print Statement with Action

Create a rule for a print statement: `print(ID);`.

- **Action:** When matched, use Java code within the grammar to print "Accessing variable: [ID_NAME]" to the console.

### 6. Boolean Expressions

Extend the `cond` rule from Lab 02 to support logical AND (`&&`) and OR (`||`).

- **Example:** `if (x > 5 && y < 10)`

---

## 🔴 Hard (Advanced Features & State)

**Topics:** `@members`, `@init`, `@after`, exception handling, return values.

### 7. Balance Tracker (Based on Lab 03)

Modify the `withdraw` rule to prevent the balance from going below zero.

- **Requirement:**
  - Use a `@members` field to store the `currentBalance`.
  - In the action block, check if `amount <= currentBalance`.
  - If it is, subtract and return the new balance.
  - If not, print "Insufficient funds!" and keep the balance unchanged.

### 8. Enhanced Error Reporting

Implement a custom `catch` block for a rule that handles variable declarations.

- **Requirement:** If the user forgets the semicolon `;` at the end of a declaration, catch the `NoViableAltException` and print a user-friendly message: "Missing semicolon at the end of the line!".

### 9. Nested Scopes (Advanced)

Create a rule for nested blocks `{ ... }`.

- **Requirement:**
  - Use a `@members` variable to track the nesting level.
  - Use `@init` to increment the level when entering a block.
  - Use `finally` to decrement the level when exiting.
  - Print the current nesting level each time a block ends.
