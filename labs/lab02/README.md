# Lab 02: Control Flow & Logic

## 🎯 Objectives

- Expand grammar to handle multiple declaration styles.
- Implement control flow structures (if-else).
- Introduce comments and whitespace handling.

## 📝 Grammar Focus

The grammar `lab02.g` introduces rule alternatives and optional components:

- **Multiple declarations**: `(Int_type|Double_type) ID (',' ID)* ';'`
- **Control flow**: `if '(' cond ')' '{' dec* '}' else_?`
- **Comments**: `SingleLineComment : '//' ~('\r'|'\n'|'\r\n')* {skip();};`

## 🚀 How to Run

1. Open `grammar/lab02.g`.
2. Use **Ctrl+Shift+B** > **Java: Compile Lab**.
3. Run using the **"Run Current Lab"** task.
