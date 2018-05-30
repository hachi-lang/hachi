// Generated from Corgi.g4 by ANTLR 4.7.1

    package corgi.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CorgiParser}.
 */
public interface CorgiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CorgiParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CorgiParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CorgiParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CorgiParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CorgiParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(CorgiParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(CorgiParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(CorgiParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(CorgiParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CorgiParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CorgiParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CorgiParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CorgiParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(CorgiParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(CorgiParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(CorgiParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(CorgiParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#functionParameterDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterDefaultValue(CorgiParser.FunctionParameterDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#functionParameterDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterDefaultValue(CorgiParser.FunctionParameterDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(CorgiParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(CorgiParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CorgiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CorgiParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CorgiParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CorgiParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(CorgiParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(CorgiParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CorgiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CorgiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CorgiParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CorgiParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CorgiParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CorgiParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(CorgiParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(CorgiParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CorgiParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CorgiParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnVoid}
	 * labeled alternative in {@link CorgiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoid(CorgiParser.ReturnVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnVoid}
	 * labeled alternative in {@link CorgiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoid(CorgiParser.ReturnVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnWithValue}
	 * labeled alternative in {@link CorgiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnWithValue(CorgiParser.ReturnWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnWithValue}
	 * labeled alternative in {@link CorgiParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnWithValue(CorgiParser.ReturnWithValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CorgiParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CorgiParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CorgiParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CorgiParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(CorgiParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(CorgiParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(CorgiParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(CorgiParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CorgiParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CorgiParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CorgiParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CorgiParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableReferenceLabel}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableReferenceLabel(CorgiParser.VariableReferenceLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableReferenceLabel}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableReferenceLabel(CorgiParser.VariableReferenceLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallLabel(CorgiParser.FunctionCallLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallLabel(CorgiParser.FunctionCallLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueLabel}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueLabel(CorgiParser.ValueLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueLabel}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueLabel(CorgiParser.ValueLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CorgiParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CorgiParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(CorgiParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(CorgiParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivide(CorgiParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivide(CorgiParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(CorgiParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link CorgiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(CorgiParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(CorgiParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(CorgiParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CorgiParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CorgiParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CorgiParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CorgiParser.ValueContext ctx);
}