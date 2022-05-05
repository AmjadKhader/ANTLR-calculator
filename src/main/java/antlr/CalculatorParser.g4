grammar CalculatorParser;
import CalculatorLexer;

calculator:
    first_number WHITESPACE? process WHITESPACE? second_number EOF #main_rule
;

first_number: number_rule;
second_number: number_rule;

number_rule:
      number1
    | number1 WHITESPACE? DOT WHITESPACE? number2
;

number1: num ;
number2: num ;
process: PLUS | MINUS | MULTIPLY | DIVIDE;

num: ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE ;