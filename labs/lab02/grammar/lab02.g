grammar lab02;

//Declarations
dec	:	dec1|dec2|dec3|dec4;
dec1:	Int_type ID '=' INT';';
dec2:	Double_type ID '=' DOUBLE';';
dec3:	(Int_type|Double_type)ID(','ID)*';';
dec4:	(Int_type|Double_type) ID '='ID(OPR ID)*';';

//if-else statement
if_ :'if''('cond')''{'dec*'}'else_?{System.out.print($cond.text);};
cond :	(ID|INT|DOUBLE)BOPR(ID|INT|DOUBLE);
else_:	'else''{'dec*'}';


//Single line comment
SingleLineComment	: '//' ~('\r'|'\n'|'\r\n')* {skip();}; 

//Tokens
Int_type:'int';
Double_type:'double';
ID	:('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
INT	:('0'..'9')+;
DOUBLE:INT'.'INT;
OPR	:	'-'|'+'|'*'|'/';
BOPR:	('<='|'<'|'>'|'>='|'=='|'!=');
WS	:	(' '|'\t'|'\n'|'\r'|'\r\n'){skip();};
