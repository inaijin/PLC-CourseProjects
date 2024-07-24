// Generated from /Users/kourosh/Uni/PLC/CA/Phase1/Codes/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(FunctionCraftParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(FunctionCraftParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(FunctionCraftParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(FunctionCraftParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#builtIn}.
	 * @param ctx the parse tree
	 */
	void enterBuiltIn(FunctionCraftParser.BuiltInContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#builtIn}.
	 * @param ctx the parse tree
	 */
	void exitBuiltIn(FunctionCraftParser.BuiltInContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void enterPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void exitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void enterChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void exitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void enterChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void exitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FunctionCraftParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FunctionCraftParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#flowControl}.
	 * @param ctx the parse tree
	 */
	void enterFlowControl(FunctionCraftParser.FlowControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#flowControl}.
	 * @param ctx the parse tree
	 */
	void exitFlowControl(FunctionCraftParser.FlowControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(FunctionCraftParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(FunctionCraftParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifStmtParams}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtParams(FunctionCraftParser.IfStmtParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifStmtParams}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtParams(FunctionCraftParser.IfStmtParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(FunctionCraftParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(FunctionCraftParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseIfBlocks}.
	 * @param ctx the parse tree
	 */
	void enterElseIfBlocks(FunctionCraftParser.ElseIfBlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseIfBlocks}.
	 * @param ctx the parse tree
	 */
	void exitElseIfBlocks(FunctionCraftParser.ElseIfBlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(FunctionCraftParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(FunctionCraftParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(FunctionCraftParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(FunctionCraftParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FunctionCraftParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FunctionCraftParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(FunctionCraftParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(FunctionCraftParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#appendExpression}.
	 * @param ctx the parse tree
	 */
	void enterAppendExpression(FunctionCraftParser.AppendExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#appendExpression}.
	 * @param ctx the parse tree
	 */
	void exitAppendExpression(FunctionCraftParser.AppendExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#appendExpressionTail}.
	 * @param ctx the parse tree
	 */
	void enterAppendExpressionTail(FunctionCraftParser.AppendExpressionTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#appendExpressionTail}.
	 * @param ctx the parse tree
	 */
	void exitAppendExpressionTail(FunctionCraftParser.AppendExpressionTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(FunctionCraftParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(FunctionCraftParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(FunctionCraftParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(FunctionCraftParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(FunctionCraftParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(FunctionCraftParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(FunctionCraftParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(FunctionCraftParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpression(FunctionCraftParser.PlusMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpression(FunctionCraftParser.PlusMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#plusMinusExpressionTail}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpressionTail(FunctionCraftParser.PlusMinusExpressionTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#plusMinusExpressionTail}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpressionTail(FunctionCraftParser.PlusMinusExpressionTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#multiplyDivideExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyDivideExpression(FunctionCraftParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#multiplyDivideExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyDivideExpression(FunctionCraftParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#multiplyDivideExpressionTail}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyDivideExpressionTail(FunctionCraftParser.MultiplyDivideExpressionTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#multiplyDivideExpressionTail}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyDivideExpressionTail(FunctionCraftParser.MultiplyDivideExpressionTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(FunctionCraftParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(FunctionCraftParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#unaryExpressionPost}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPost(FunctionCraftParser.UnaryExpressionPostContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#unaryExpressionPost}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPost(FunctionCraftParser.UnaryExpressionPostContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#unaryExpressionPostTail}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionPostTail(FunctionCraftParser.UnaryExpressionPostTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#unaryExpressionPostTail}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionPostTail(FunctionCraftParser.UnaryExpressionPostTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#retrieveListExpression}.
	 * @param ctx the parse tree
	 */
	void enterRetrieveListExpression(FunctionCraftParser.RetrieveListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#retrieveListExpression}.
	 * @param ctx the parse tree
	 */
	void exitRetrieveListExpression(FunctionCraftParser.RetrieveListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#paranthesisExpression}.
	 * @param ctx the parse tree
	 */
	void enterParanthesisExpression(FunctionCraftParser.ParanthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#paranthesisExpression}.
	 * @param ctx the parse tree
	 */
	void exitParanthesisExpression(FunctionCraftParser.ParanthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(FunctionCraftParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(FunctionCraftParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(FunctionCraftParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(FunctionCraftParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#matchExpr}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpr(FunctionCraftParser.MatchExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#matchExpr}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpr(FunctionCraftParser.MatchExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#funcParameter}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameter(FunctionCraftParser.FuncParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#funcParameter}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameter(FunctionCraftParser.FuncParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#funcParameterDefault}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameterDefault(FunctionCraftParser.FuncParameterDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#funcParameterDefault}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameterDefault(FunctionCraftParser.FuncParameterDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void enterDataTypes(FunctionCraftParser.DataTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void exitDataTypes(FunctionCraftParser.DataTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FunctionCraftParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FunctionCraftParser.ListContext ctx);
}