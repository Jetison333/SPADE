using System.Reflection;
using System.Threading.Tasks.Dataflow;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;


class codeGen : ImathListener {
    public UtilCollection collection;
    public Dictionary<string, UtilCollection> map;
    public bool constraintsMet = true;

    public Stack<FormatDescriptor> formatStack;

    public Stack<SetDescriptor> setDescriptorStack;

    public Stack<ConstraintDescriptor> constraintDescriptorStack;

    public codeGen(UtilCollection c) : base() 
    {
        collection = c;
        map = new();
        formatStack = new();
        setDescriptorStack = new();
        constraintDescriptorStack = new();
    }
    /// <summary>
    /// Enter a parse tree produced by <see cref="mathParser.start"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void EnterStart([NotNull] mathParser.StartContext context)
    {

    }
    /// <summary>
    /// Exit a parse tree produced by <see cref="mathParser.start"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void ExitStart([NotNull] mathParser.StartContext context)
    {

    }
    /// <summary>
    /// Enter a parse tree produced by <see cref="mathParser.format"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void EnterFormat([NotNull] mathParser.FormatContext context)
    {
        /*
        if (context.format().Length != 0)
        {
            UtilCollection curr = formatStack.Pop();
            for (int i = context.format().Length - 1; i >= 0; i--) 
            //has to iterate backwards, since the leftmost one should be popped first
            {
                formatStack.Push(curr[i]);
            }
        }
        if (context.TERM() != null)
        {
            map.Add(context.TERM().ToString()!, formatStack.Pop());
        }
    */
    }
    /// <summary>
    /// Exit a parse tree produced by <see cref="mathParser.format"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void ExitFormat([NotNull] mathParser.FormatContext context)
    {
        if (context.format().Length != 0)
        {
            List<FormatDescriptor> lst = new();
            for (int i = 0; i < context.format().Length; i++)
            {
                lst.Add(formatStack.Pop());           
            }
            lst.Reverse(); // have to reverse the list, since the leftmost should be the one that was popped first
            formatStack.Push(new FormatDescriptor(lst));
        }
        if (context.TERM() != null)
        {
            formatStack.Push(new FormatDescriptor(context.TERM().ToString()!));
        }

        if (context.Parent is not mathParser.FormatContext)
        {
            map = new();
            FormatDescriptor form = formatStack.Pop();
            if (formatStack.Count() != 0) throw new Exception("formatStack not empty after eval");
            form.parseFunc(map, collection);
        }
    }
    /// <summary>
    /// Enter a parse tree produced by <see cref="mathParser.constraint"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void EnterConstraint([NotNull] mathParser.ConstraintContext context)
    {
    }
    /// <summary>
    /// Exit a parse tree produced by <see cref="mathParser.constraint"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void ExitConstraint([NotNull] mathParser.ConstraintContext context)
    {
        switch(context.DEFINITION().ToString())
        {
            case "is":
                if (context.@object() != null && context.@object().BUILT_IN != null)
                switch(context.@object().BUILT_IN().ToString())
                {
                    case "set":
                        constraintsMet = constraintsMet && map[context.TERM().ToString()!].IsUnordered();                    
                        if (map[context.TERM().ToString()!].IsOrdered())
                        {
                            throw new Exception($"Constraint {context.TERM()} {context.DEFINITION()} {context.@object().BUILT_IN()} failed because {context.TERM()} was not a set");
                        }
                        break;
                    case "list":
                        constraintsMet = constraintsMet && map[context.TERM().ToString()!].IsOrdered();                    
                        if (map[context.TERM().ToString()!].IsUnordered())
                        {
                            throw new Exception($"Constraint {context.TERM()} {context.DEFINITION()} {context.@object().BUILT_IN()} failed because {context.TERM()} was not a list");
                        }
                        break;
                    case "int":
                        constraintsMet = constraintsMet && map[context.TERM().ToString()!].IsValue();                    
                        if (!map[context.TERM().ToString()!].IsValue())
                        {
                            throw new Exception($"Constraint {context.TERM()} {context.DEFINITION()} {context.@object().BUILT_IN()} failed because {context.TERM()} was not a value");
                        }
                        break;
                }
                break;

            case "subset":
                if (context.@object() != null)
                {
                    if (context.@object().BIN_OP() != null || context.@object().set() != null)
                    {
                        SetDescriptor subsetSet = setDescriptorStack.Pop();
                        bool constraintMet = true;
                        foreach (UtilCollection item in map[context.TERM().ToString()!])
                        {
                            if (!subsetSet.isMember(item))
                            {
                                constraintMet = false;
                                throw new Exception($"Constraint {context.TERM()} {context.DEFINITION()} {context.@object().GetText()} failed because {item} was not a subset of {context.@object().GetText()}");
                            }
                        }
                        constraintsMet = constraintMet && constraintsMet;
                    }
                }
                break;
        }
    }
    /// <summary>
    /// Enter a parse tree produced by <see cref="mathParser.object"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void EnterObject([NotNull] mathParser.ObjectContext context)
    {
    }
    /// <summary>
    /// Exit a parse tree produced by <see cref="mathParser.object"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void ExitObject([NotNull] mathParser.ObjectContext context)
    {
        if (context.TERM() != null)
        {
            setDescriptorStack.Push(new SetDescriptor(map, context.TERM().ToString()!));
        }

        if (context.BIN_OP() != null)
        {
            SetDescriptor right = setDescriptorStack.Pop();
            SetDescriptor left = setDescriptorStack.Pop();
            switch (context.BIN_OP().ToString())
            {
                case "union":
                    setDescriptorStack.Push(left.Union(right));
                    break;
                case "intersection":
                    setDescriptorStack.Push(left.Intersect(right));
                    break;
                case "cross":
                    setDescriptorStack.Push(left.Cross(right));
                    break;
                case "unorderedcross":
                    setDescriptorStack.Push(left.UnorderedCross(right));
                    break;
            }

        }
    }
    /// <summary>
    /// Enter a parse tree produced by <see cref="mathParser.set"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void EnterSet([NotNull] mathParser.SetContext context)
    {
    }
    /// <summary>
    /// Exit a parse tree produced by <see cref="mathParser.set"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void ExitSet([NotNull] mathParser.SetContext context)
    {
    }
    /// <summary>
    /// Enter a parse tree produced by <see cref="mathParser.list"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void EnterList([NotNull] mathParser.ListContext context)
    {
    }
    /// <summary>
    /// Exit a parse tree produced by <see cref="mathParser.list"/>.
    /// </summary>
    /// <param name="context">The parse tree.</param>
    public void ExitList([NotNull] mathParser.ListContext context)
    {
    }

    public void VisitTerminal(ITerminalNode node)
    {
    }

    public void VisitErrorNode(IErrorNode node)
    {
    }

    public void EnterEveryRule(ParserRuleContext ctx)
    {
    }

    public void ExitEveryRule(ParserRuleContext ctx)
    {
    }
}