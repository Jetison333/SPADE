

using System.Diagnostics;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

class DF
{
    readonly string format;
    public Dictionary<string, UtilCollection> map;

    public DF (string f)
    {
        format = f;
    }

    public void parse(string instance)
    {
        AntlrInputStream stream = new AntlrInputStream(format);
        mathLexer lex =  new mathLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        mathParser parser = new mathParser(tokens);

        parser.BuildParseTree = true;
        IParseTree parseTree = parser.start();
        codeGen gen = new codeGen(new UtilCollection(instance));
        ParseTreeWalker.Default.Walk(gen, parseTree);

        map = gen.map; 

    }

    public UtilCollection this[string key]
    {
        get { return map[key]; }
    }
}