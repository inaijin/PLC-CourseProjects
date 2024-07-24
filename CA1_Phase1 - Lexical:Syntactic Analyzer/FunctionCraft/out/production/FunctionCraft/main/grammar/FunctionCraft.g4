grammar FunctionCraft;

// Parser Rules:

program
    :
    (function | pattern | COMMENT)* main COMMENT*
    ;

main
    :
    DEF
    MAIN { System.out.println("MAIN"); }
    LPAR
    RPAR
    functionBody
    END
    ;

function
    :
    DEF
    name = IDENTIFIER { System.out.println("FuncDec: " + $name.text); }
    LPAR
    (functionParameters)?
    RPAR
    functionBody
    END
    ;

functionParameters
    :
    funcParameter |
    (funcParameter
    COMMA
    funcParameterDefault) |
    funcParameterDefault
    ;

functionBody
    :
    (statement | COMMENT)*
    (RETURN { System.out.println("RETURN"); }
    (statement)?)?
    ;

statement
    :
    (expr) SEMICOLON
    | loop
    | ifstmt
    ;

builtIn
    :
    puts |
    len |
    push |
    match |
    chop |
    chomp
    ;

pattern
    :
    PATTERN
    name = IDENTIFIER { System.out.println("PatternDec: " + $name.text); }
    LPAR
    (IDENTIFIER (COMMA IDENTIFIER)*)
    RPAR
    (SEPERATOR LPAR expr RPAR ASSIGN expr)+
    SEMICOLON
    ;

puts
    :
    PUTS { System.out.println("Built-In: PUTS"); }
    LPAR
        (
        expr
        )
    RPAR
    ;

len
    :
    LEN { System.out.println("Built-In: LEN"); }
    LPAR
        (
        (list (LBRAK INT_VAL RBRAK)) |
        expr
        )
    RPAR
    ;

push
    :
    PUSH { System.out.println("Built-In: PUSH"); }
    LPAR
    (
        (expr COMMA expr)
    )
    RPAR
    ;

match
    :
    MATCH { System.out.println("Built-In: MATCH"); }
    LPAR
    (
    expr
    )
    RPAR
    ;

chop
    :
    CHOP { System.out.println("Built-In: CHOP"); }
    LPAR
    (
    expr
    )
    RPAR
    ;

chomp
    :
    CHOMP { System.out.println("Built-In: CHOMP"); }
    LPAR
    (
    expr
    )
    RPAR
    ;

functionCall
    :
    IDENTIFIER { System.out.println("Function Call"); }
    (
    LPAR
    (
    (expr)
        (
        COMMA
        expr
        )*
    )?
    RPAR
    )
    ;

loop
    :
    (
    LOOP { System.out.println("Loop: DO"); }
    DO
    (statement | flowControl | COMMENT)*
    END
    ) |
    (
    FOR { System.out.println("Loop: FOR"); }
    IDENTIFIER
    IN
        (
        (LPAR
        (IDENTIFIER | INT_VAL)
        DOT
        DOT
        (IDENTIFIER | INT_VAL)
        RPAR) |
        IDENTIFIER |
        list
        )
    (statement | flowControl | COMMENT)*
    END
    )
    ;

flowControl
    :
    (
        (NEXT { System.out.println("Control: NEXT"); }  | NEXT { System.out.println("Control: NEXT"); } IF LPAR expr  RPAR)|
        (BREAK { System.out.println("Control: BREAK"); } | BREAK { System.out.println("Control: BREAK"); } IF LPAR expr RPAR)
    )
    SEMICOLON
    ;

ifstmt
    :
    IF { System.out.println("Decision: IF"); }
    ifStmtParams ifBlock elseIfBlocks elseBlock END
    ;

ifStmtParams
    :
    LPAR expr RPAR ((AND | OR) ifStmtParams)*
    ;

ifBlock
    :
    statementList
    ;

elseIfBlocks
    :
    (ELSEIF ifStmtParams { System.out.println("Decision: ELSE IF"); } statementList)*
    ;

elseBlock
    :
    (ELSE { System.out.println("Decision: ELSE"); } statementList)?
    ;

statementList
    :
    (statement | RETURN { System.out.println("RETURN"); } (expr)? SEMICOLON | flowControl | COMMENT)*
    ;

lambdaFunction
    :
    ARROW { System.out.println("Structure: LAMBDA"); }
    LPAR
    (IDENTIFIER (COMMA IDENTIFIER)*)?
    RPAR
    LBRACE
    functionBody
    RBRACE
    (
        LPAR
        (IDENTIFIER (COMMA IDENTIFIER)*)
        RPAR
    )?
    ;

expr
    :
    assignExpression
    ;

assignExpression
    :
    name=appendExpression (ASSIGN assignExpression {System.out.println("Assignment: " + $name.text);})?
    ;

appendExpression
    : logicalOrExpression appendExpressionTail
    ;

appendExpressionTail
    : APPEND logicalOrExpression {System.out.println("Operator : <<");} appendExpressionTail
    | // ε
    ;

logicalOrExpression
    :
    LPAR logicalAndExpression RPAR (OR LPAR logicalAndExpression RPAR {System.out.println("Operator : ||");})*
    | logicalAndExpression
    ;

logicalAndExpression
    :
    LPAR equalExpression RPAR (AND LPAR logicalAndExpression RPAR {System.out.println("Operator : &&");})*
    | equalExpression
    ;

equalExpression
    :
    comparisonExpression (EQL comparisonExpression {System.out.println("Operator : ==");} |
                          NEQ comparisonExpression {System.out.println("Operator : !=");})*
    ;

comparisonExpression
    :
    plusMinusExpression (LES plusMinusExpression {System.out.println("Operator : <");} |
                         GTR plusMinusExpression {System.out.println("Operator : >");} |
                         GEQ plusMinusExpression {System.out.println("Operator : >=");} |
                         LEQ plusMinusExpression {System.out.println("Operator : <=");})*
    ;

plusMinusExpression
    : multiplyDivideExpression plusMinusExpressionTail
    ;

plusMinusExpressionTail
    : (PLUS multiplyDivideExpression {System.out.println("Operator : +");} |
       MINUS multiplyDivideExpression {System.out.println("Operator : -");} |
       PLUSEQ multiplyDivideExpression {System.out.println("Operator : +=");} |
       MINEQ multiplyDivideExpression {System.out.println("Operator : -=");}) plusMinusExpressionTail
    | // ε
    ;

multiplyDivideExpression
    : unaryExpression multiplyDivideExpressionTail
    ;

multiplyDivideExpressionTail
    : (MULT unaryExpression {System.out.println("Operator : *");} |
       DIV unaryExpression {System.out.println("Operator : /");} |
       MULTEQ unaryExpression {System.out.println("Operator : *=");} |
       DIVEQ unaryExpression {System.out.println("Operator : /=");} |
       MODEQ multiplyDivideExpression {System.out.println("Operator : %=");}) multiplyDivideExpressionTail
    | // ε
    ;

unaryExpression
    :
    (NOT unaryExpression {System.out.println("Operator : !");} |
     MINUS unaryExpression {System.out.println("Operator : -");} |
     unaryExpressionPost)
    ;

unaryExpressionPost
    : retrieveListExpression unaryExpressionPostTail
    ;

unaryExpressionPostTail
    : (PLUSPLUS {System.out.println("Operator : ++");} |
       MINUSMINUS {System.out.println("Operator : --");}) unaryExpressionPostTail
    | // ε
    ;

retrieveListExpression
    :
    paranthesisExpression (LBRAK (expr) RBRAK)*
    ;

paranthesisExpression
    :
    dataTypes |
    variableExpression (LPAR (expr (COMMA expr)*)? RPAR)* |
    LPAR expr? RPAR
    ;

variableExpression
    :
    builtIn |
    functionCall |
    method |
    matchExpr |
    lambdaFunction
    ;

method
    :
    METHOD
    LPAR
    COLON
    IDENTIFIER
    RPAR
    ;

matchExpr
    :
    IDENTIFIER
    DOT
    MATCH
    LPAR
    expr
    RPAR { System.out.println("Built-In: MATCH"); }
    ;

funcParameter
    :
    IDENTIFIER
        (
        COMMA
        IDENTIFIER
        )*
    ;

funcParameterDefault
    :
    LBRAK
    IDENTIFIER
    ASSIGN
    expr
        (
        COMMA
        IDENTIFIER
        ASSIGN
        expr
        )*
    RBRAK
    ;

dataTypes
    :
    INT_VAL |
    FLOAT_VAL |
    STRING_VAL |
    BOOL_VAL |
    list |
    IDENTIFIER
    ;

list
    :
    LBRAK
        (
        (expr(COMMA expr)*)
        )?
    RBRAK
    ;

// Lexer Tokens:

MAIN: 'main';
DEF: 'def';
RETURN: 'return';
END: 'end';
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';
CHOP: 'chop';
CHOMP: 'chomp';
PUSH: 'push';
PUTS: 'puts';
METHOD: 'method';
LEN: 'len';
PATTERN: 'pattern';
MATCH: 'match';
NEXT: 'next';
BREAK: 'break';
LOOP: 'loop';
DO: 'do';
FOR: 'for';
IN: 'in';

ARROW: '->';
LPAR: '(';
RPAR: ')';
NOT: '!';
PLUS: '+';
MINUS: '-';
MINUSMINUS: '--';
PLUSPLUS: '++';
MULT: '*';
DIV: '/';
GEQ: '>=';
LEQ: '<=';
GTR: '>';
LES: '<';
EQL: '==';
NEQ: '!=';
PLUSEQ: '+=';
MINEQ: '-=';
MULTEQ: '*=';
DIVEQ: '/=';
MODEQ: '%=';
AND: '&&';
OR: '||';
APPEND: '<<';
ASSIGN: '=';
LBRACE: '{';
RBRACE: '}';
LBRAK: '[';
RBRAK: ']';
COMMA: ',';
DOT: '.';
COLON: ':';
SEMICOLON: ';';
SEPERATOR: [\r][\n] ([\t] | '    ') '|' | [\n] ([\t] | '    ') '|';

INT_VAL: [1-9][0-9]* | '0';
FLOAT_VAL: [0-9]+'.'[0-9]+;
STRING_VAL: '"' ~["]* '"';
BOOL_VAL: ('true' | 'false');
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

COMMENT: ('#' ~[\r\n]* | '=begin' .*? '=end') -> skip;
WS: ([ \t\r\n]) -> skip;
