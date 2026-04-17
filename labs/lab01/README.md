# Lab 01: Basics & Declarations

## 🎯 Objectives

- Understand the basic structure of an ANTLR v3 grammar.
- Define simple tokens (Lexer rules) and rules (Parser rules).
- Handle integer and double variable declarations.

## 📝 Grammar Focus

The grammar `lab01.g` focuses on recognizing basic assignment patterns:

```antlr
dec1: Int_type ID '=' Int_type;
dec2: Double_type ID '=' Double_type;
```

## 🚀 How to Run

1. Open `grammar/lab01.g`.
2. Use **Ctrl+Shift+B** > **Java: Compile Lab**.
3. Run using the **"Run Current Lab"** task.
