grammar exercise_02;

/**
 * Exercise 2 Solution:
 * Adds lexer rules for Multiplication and Division.
 * Includes a WS rule to skip whitespace.
 */

expr : term (OP term)* ;
term : INT ;

// Lexer Rules
OP  : '*' | '/' | '+' | '-' ;
INT : ('0'..'9')+ ;

// Skips whitespace between tokens
WS  : (' ' | '\t' | '\r' | '\n')+ { skip(); } ;
