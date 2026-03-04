# Comp407: Compiler Construction Study Guide

This repository contains the collected labs, resources, and study materials for the Comp407 Compiler course. It is organized to support the weekly progression of the course, with each lab isolated in its own directory.

## Repository Structure

The repository is organized into three main directories:

- `lib/`: Contains the necessary JAR files for the project, primarily the ANTLR v3.4 library. All labs will reference this central directory for their dependencies.

- `labs/`: This is where the core of the coursework resides. Each lab is contained within its own numbered sub-directory (e.g., `lab01`, `lab02`) and follows a standard internal structure:
  - `grammar/`: Holds the ANTLR grammar file (`.g`) for that specific lab.
  - `src/`: Contains any Java source code you write (e.g., `Main.java`, visitors, or listeners).
  - `output/`: The destination for all generated and compiled files (`.java`, `.tokens`, `.class`). This directory can be safely cleared and regenerated.
  - `README.md`: (Optional) A brief on the objectives of the lab.

- `resources/`: Contains general course-wide materials, such as study guides, exercises, or example code not tied to a specific lab.

## How to Run a Lab

Each lab is a self-contained project. To compile and run a lab, you will need to perform two main steps: generate the parser from the grammar and then compile the Java sources.

Here are the example commands, which you can run from the root of the repository. These examples use `lab01`, but the process is the same for all labs.

### 1. Generate the ANTLR Lexer and Parser

This command tells ANTLR to process the grammar file and place the generated Java files into the lab's `output` directory.

```bash
java -jar ./lib/antlr-3.4-complete.jar -o ./labs/lab01/output/ ./labs/lab01/grammar/lab01.g
```

### 2. Compile the Java Code

This command compiles your handwritten `.java` files from the `src` directory along with the ANTLR-generated files in the `output` directory. The compiled `.class` files are placed in the `output` directory.

```bash
javac -cp ".:./lib/antlr-3.4-complete.jar" -d ./labs/lab01/output/ ./labs/lab01/src/*.java ./labs/lab01/output/*.java
```

### 3. Run the Compiled Program

Finally, run the compiled code. Make sure to include both the ANTLR library and the `output` directory in your classpath. (Note: This assumes your main class is named `Main`).

```bash
java -cp ".:./lib/antlr-3.4-complete.jar:./labs/lab01/output/" Main
```

---
