# Comp407: Compiler Construction Study Guide

This repository contains the collected labs, resources, and study materials for the Comp407 Compiler course. It is organized to support the weekly progression of the course, with each lab isolated in its own directory.

---

## ⚡ Quick Start (VS Code)

To build and run a lab instantly:

1. Open a grammar file (e.g., `labs/lab03/grammar/lab03.g`).
2. Press **`Ctrl+Shift+B`** and select **"Java: Compile Lab"**.
3. To run, use the **"Run Current Lab"** task (accessible via `F1` > `Run Task`).

---

## 📂 Repository Structure

The project follows a standardized layout to keep things clean and predictable:

- **`lib/`**: Contains core dependencies (`antlr-3.4-complete.jar`).
- **`labs/`**: The core coursework, numbered by week:
  - **`grammar/`**: ANTLR grammar files (`.g`).
  - **`src/`**: Your handwritten Java code (e.g., `Main.java`).
  - **`tests/`**: Sample input files (`.txt`) to test your parser.
  - **`output/`**: Generated and compiled artifacts (Git-ignored).
- **`resources/`**: General course-wide study guides and exercises.

---

## 🛠️ How to Run Manually

If you prefer using the terminal, run these commands from the **root** of the repository.

### 1. Generate Parser

```bash
java -jar ./lib/antlr-3.4-complete.jar -o ./labs/lab01/output/ ./labs/lab01/grammar/lab01.g
```

### 2. Compile Java

```bash
javac -cp ".:./lib/antlr-3.4-complete.jar" -d ./labs/lab01/output/ ./labs/lab01/src/*.java ./labs/lab01/output/*.java
```

### 3. Run Program

```bash
java -cp ".:./lib/antlr-3.4-complete.jar:./labs/lab01/output/" Main
```

---

## 📖 Lab Guides

- [Lab 01: Basics & Declarations](./labs/lab01/README.md)
- [Lab 02: Control Flow & Logic](./labs/lab02/README.md)
- [Lab 03: Actions & Errors](./labs/lab03/README.md)
