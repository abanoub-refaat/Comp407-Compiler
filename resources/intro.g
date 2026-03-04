grammar intro;

// types
Int_type: 'int';
Double_type: 'double';

// TOKENS:
ID: ('a' .. 'z'| 'A' .. 'Z'| '_')('a' .. 'z'| 'A' .. 'Z'| '_'| '0' .. '9')*;
INT: ('0'..'9')+;
DOUBLE: INT '.' INT;
OPR: '+' | '-' | '/' | '*' | '%' | '**' | '^';
BOPR: ('<' | '>' | '<=' | '>=' | '==' | '!=' | '<>');
WS: (' ' | '\t' | '\n'| '\r' | '\r\n'){skip();};

// DECLARATIONS:
dec: Int_type ID ('=' INT ';'| ';');
dec2: Int_type ID (',' ID)*';';
dec3: Int_type ID ('=' INT)? (',' ID ('=' INT)?)* ';';

// Arithmatic Declarations:
dec4: ID '=' expr ';';
expr: term (('+' | '-') term)*;
term: factor(('*' | '/') factor)*;
factor: INT | ID | '(' expr ')';

// Boolean Declarations; 
dec5: ID '=' boolExpr ';';
boolExpr: boolTerm ('||' boolTerm)*;
boolTerm: boolFactor ('&&' boolFactor)*;
boolFactor: expr BOPR expr | '(' boolExpr ')';

// Control Flow:
if_: 'if' '(' boolExpr ')' '{' stmt* '}' ('else' 'if' '(' boolExpr ')' '{' stmt* '}')* ('else' '{' stmt* '}')?;
while_:'while' '(' boolExpr ')' '{' stmt* '}';
do_:'do' '{' stmt* '}' 'while' '(' boolExpr ')' ';';

stmt: dec | dec2 | dec3 | dec4 | dec5 | if_ | while_ | do_;