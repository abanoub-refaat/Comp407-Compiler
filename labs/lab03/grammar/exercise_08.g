grammar exercise_08;

/**
 * Exercise 8 Solution:
 * Implements a variable declaration rule with a custom catch block 
 * to handle missing semicolons or other structural errors.
 */
decl
    :   TYPE ID '=' INT ';'
    ;
    // Specific catch block for NoViableAltException as requested in the exercise
    catch [NoViableAltException nvae] {
        System.out.println("Missing semicolon at the end of the line!");
        reportError(nvae);
    }
    // Generic catch for other potential recognition errors
    catch [RecognitionException re] {
        System.out.println("Syntax error in declaration. Please check your input.");
        reportError(re);
    }

// Lexer Rules
TYPE : 'int' | 'double' ;
ID   : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;
INT  : ('0'..'9')+ ;
WS   : (' ' | '\t' | '\r' | '\n')+ { skip(); } ;
