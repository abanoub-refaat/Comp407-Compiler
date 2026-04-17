grammar quiz02;

options{
    language = java;
}

dec returns [boolean ebram]:
    a=INT op=OP b=INT {
        if($op.text.equals(">")){
            $ebram = Integer.parseInt($a.text) > Integer.parseInt($b.text) ;
         } else if($op.text.equals("<")){
            $ebram = Integer.parseInt($a.text) < Integer.parseInt($b.text) ;
         } else {
            $ebram = Integer.parseInt($a.text) == Integer.parseInt($b.text) ;        
        }
    }
;

INT:    '0'..'9'+;
WS: ('\n'|' '|'\r'|'\t')+{skip();};
OP: '<'| '>' | '==';