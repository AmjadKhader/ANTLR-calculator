grammar NumbersParser;
import NumbersLexer;

calculator:
    first_number WHITESPACE? process WHITESPACE? second_number EOF #main_rule
;

first_number: number_rule;
second_number: number_rule;

number_rule:
      number  #rule_1
    | (number WHITESPACE? DOT WHITESPACE? number)+ #rule_2
;

number: ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE ;
process: PLUS | MINUS | MULTIPLY | DIVIDE;