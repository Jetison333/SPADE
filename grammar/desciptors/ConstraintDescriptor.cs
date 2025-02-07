using DiscreteParser;

namespace DiscreteParser.grammar.descriptor;

class ConstraintDescriptor
{
    Dictionary<String, UtilCollection> map;
    String term;
    String definition;
    SetDescriptor? set;
    String? built_in;

    public ConstraintDescriptor(Dictionary<String, UtilCollection> _map, String _term, String _definition, SetDescriptor _set)
    {
       map = _map;
       term = _term;
       definition = _definition; 
       set = _set;
    }

    public ConstraintDescriptor(Dictionary<String, UtilCollection> _map, String _term, String _definition, String _built_in)
    {
       map = _map;
       term = _term;
       definition = _definition; 
       built_in = _built_in;
    }


    public void check()
    {
        switch (definition)
        {
            case "is":
                if (built_in != null)
                    switch (built_in)
                    {
                        case "set":
                            if (map[term].IsOrdered())
                            {
                                throw new Exception($"Constraint {term} {definition} {built_in} failed because {term} was not a set");
                            }
                            break;
                        case "list":
                            if (map[term].IsUnordered())
                            {
                                throw new Exception($"Constraint {term} {definition} {built_in} failed because {term} was not a list");
                            }
                            break;
                        case "int":
                            if (!map[term].IsValue())
                            {
                                throw new Exception($"Constraint {term} {definition} {built_in} failed because {term} was not a value");
                            }
                            break;
                    }
                break;

            case "subset":
                if (set != null)
                {
                        foreach (UtilCollection item in map[term])
                        {
                            if (!set.isMember(item))
                            {
                                throw new Exception($"Constraint {term} {definition} PLACEHOLDER failed because {item} was not a subset of PLACEHOLDER");
                            }
                        }
                }
                break;
        }
    }
}