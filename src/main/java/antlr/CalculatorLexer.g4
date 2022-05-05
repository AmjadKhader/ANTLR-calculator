lexer grammar CalculatorLexer;

ZERO    : '0' | 'zero'  ;
ONE     : '1' | 'one'   ;
TWO     : '2' | 'two'   ;
THREE   : '3' | 'three' ;
FOUR    : '4' | 'four'  ;
FIVE    : '5' | 'five'  ;
SIX     : '6' | 'six'   ;
SEVEN   : '7' | 'seven' ;
EIGHT   : '8' | 'eight' ;
NINE    : '9' | 'nine'  ;

PLUS    : '+' | 'plus';
MINUS   : '-' | 'minus';
MULTIPLY: '*' | 'multiply' | 'multiply by';
DIVIDE  : '/' | 'divide'   | 'divided by';

DOT: '.' | 'dot' | 'point';
WHITESPACE: ' ';