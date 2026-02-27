grammar lab01;

dec1:    Int_type ID '=' Int_type;
dec2:    Double_type ID '=' Double_type;

Double_type: : 'double';
Int_type: 'int';

ID : ('a'..'z' | 'A' .. 'Z' | '_') ('a'..'z' | 'A' .. 'Z' | '_')*;
INT : ('0' .. '9')+;
DOUBLE : INT '.' INT;