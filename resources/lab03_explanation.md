# Lab 03 Grammar Explanation

This document provides a step-by-step breakdown of the `lab03.g` ANTLR grammar file.

## 1. Grammar Definition

```antlr
grammar lab03;
```

Defines the name of the grammar as `lab03`. ANTLR will use this to name the generated parser and lexer files.

## 2. Members Block

```antlr
@members {
    int usageCount = 0;
}
```

The `@members` block allows you to define fields and methods that will be part of the generated Java parser class. Here, `usageCount` tracks how many times the `withdraw` rule is executed.

## 3. The `withdraw` Rule

The `withdraw` rule is the main parser rule. It includes several specialized blocks for initialization, post-processing, and error handling.

### 3.1. Return Value

```antlr
withdraw returns [int balance]
```

The rule returns an integer value named `balance`.

### 3.2. Initialization (`@init`)

```antlr
@init {
    int startBalance = 1000;
    System.out.println("ATM Initializing...");
}
```

Code inside `@init` runs at the very beginning of the rule's execution. It sets a starting balance of 1000.

### 3.3. Post-Processing (`@after`)

```antlr
@after {
    System.out.println("Transaction successful!");
}
```

Code inside `@after` runs if the rule matches successfully, just before the rule returns.

### 3.4. Rule Body

```antlr
    :   'WITHDRAW' amt=INT
        {
            int amount = Integer.parseInt($amt.text);
            $balance = startBalance - amount;
        }
    ;
```

- Matches the literal string `'WITHDRAW'`.
- Matches an integer (`INT`) and assigns it to the label `amt`.
- **Action Block `{ ... }`**: Parses the text of `amt` into an integer and calculates the new `balance` by subtracting it from `startBalance`.

### 3.5. Exception Handling (`catch`)

```antlr
catch [RecognitionException re] {
    System.out.println("Invalid Amount Entered! Please use numbers.");
    reportError(re);
}
```

If a `RecognitionException` occurs (e.g., if the input doesn't match the expected structure), this block catches it, prints a custom error message, and reports the error.

### 3.6. Cleanup (`finally`)

```antlr
finally {
    usageCount++;
    System.out.println("ATM Session #" + usageCount + " ended.");
}
```

The `finally` block executes regardless of whether the rule succeeded or caught an exception. It increments the `usageCount` and prints a session end message.

## 4. Lexer Rules

Lexer rules define the basic tokens of the language.

### 4.1. Integer Rule

```antlr
INT : '0'..'9'+ ;
```

Matches one or more digits from 0 to 9.

### 4.2. Whitespace Rule

```antlr
WS  : (' ' | '\t' | '\r' | '\n')+ { skip(); } ;
```

Matches spaces, tabs, and newlines. The `{ skip(); }` action tells the lexer to ignore these tokens so they don't interfere with parsing.
