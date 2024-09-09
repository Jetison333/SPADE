// Generated from /home/jan-Sopi/Documents/mathSyntax/mathSyntax/grammar/math.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mathParser}.
 */
public interface mathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mathParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(mathParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(mathParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(mathParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(mathParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(mathParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(mathParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(mathParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(mathParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(mathParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(mathParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(mathParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(mathParser.ListContext ctx);
}