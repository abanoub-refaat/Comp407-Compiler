# Lab 03: Actions & Errors

## 🎯 Objectives

- Use grammar actions `{ ... }` to execute Java logic during parsing.
- Handle rule return values.
- Implement exception handling (`catch`, `finally`).

## 📝 Grammar Focus

The grammar `lab03.g` shows how to integrate Java logic:

- **Rule returns**: `dec returns [boolean ebram]`
- **In-rule actions**: `if($op.text.equals(">")) { $ebram = ... }`
- **Error handling**: `catch [RecognitionException re] { ... }`

## 📂 Exercises

This lab includes additional exercise files:

- `exercise_02.g`
- `exercise_08.g`

## 🚀 How to Run

1. Open `grammar/lab03.g`.
2. Use **Ctrl+Shift+B** > **Java: Compile Lab**.
3. Run using the **"Run Current Lab"** task.
