// Generated from /Users/kourosh/Uni/PLC/CA/Phase1/Codes/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(FunctionCraftParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(FunctionCraftParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#builtIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltIn(FunctionCraftParser.BuiltInContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(FunctionCraftParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FunctionCraftParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#flowControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowControl(FunctionCraftParser.FlowControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(FunctionCraftParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifStmtParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtParams(FunctionCraftParser.IfStmtParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(FunctionCraftParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseIfBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfBlocks(FunctionCraftParser.ElseIfBlocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(FunctionCraftParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(FunctionCraftParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FunctionCraftParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(FunctionCraftParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#appendExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendExpression(FunctionCraftParser.AppendExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#appendExpressionTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendExpressionTail(FunctionCraftParser.AppendExpressionTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(FunctionCraftParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(FunctionCraftParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(FunctionCraftParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(FunctionCraftParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpression(FunctionCraftParser.PlusMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#plusMinusExpressionTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpressionTail(FunctionCraftParser.PlusMinusExpressionTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#multiplyDivideExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyDivideExpression(FunctionCraftParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#multiplyDivideExpressionTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyDivideExpressionTail(FunctionCraftParser.MultiplyDivideExpressionTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(FunctionCraftParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#unaryExpressionPost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPost(FunctionCraftParser.UnaryExpressionPostContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#unaryExpressionPostTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionPostTail(FunctionCraftParser.UnaryExpressionPostTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#retrieveListExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetrieveListExpression(FunctionCraftParser.RetrieveListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#paranthesisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesisExpression(FunctionCraftParser.ParanthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(FunctionCraftParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(FunctionCraftParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#matchExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpr(FunctionCraftParser.MatchExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#funcParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameter(FunctionCraftParser.FuncParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#funcParameterDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameterDefault(FunctionCraftParser.FuncParameterDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#dataTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypes(FunctionCraftParser.DataTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FunctionCraftParser.ListContext ctx);
}