grammar qroup01;

options{
    language = java;
}

summation returns [int sum]:
    'Sum(i-' j=INT ')'  'from' n=INT 'to' m=INT {
        sum = 0;
        int new_j = Integer.parseInt($j.text);
        int new_n = Integer.parseInt($n.text);
        int new_m = Integer.parseInt($m.text);
        for(int i=0; i<=new_m; i++){
            sum = i - new_j;
        }
    }
;

INT:    '0'..'9'+;
WS: ('\n'|' '|'\r'|'\t')+{skip();};
