

using System.Reflection.Metadata.Ecma335;

class SetDescriptor
{
    public Func<UtilCollection,bool> isMember;

    public Func<UtilCollection> genSet;

    public Dictionary<String, UtilCollection> map;

    public SetDescriptor(Dictionary<String, UtilCollection> _map)
    {
        map = _map;
        isMember = (a) => false;
        genSet = () => new UtilCollection("");
    }

    public SetDescriptor(Dictionary<String, UtilCollection> _map, Func<UtilCollection,bool> _isMember, Func<UtilCollection> _genSet)
    {
        map = _map;
        isMember = _isMember;
        genSet = _genSet;
    }
    public SetDescriptor(Dictionary<String, UtilCollection> _map, UtilCollection collection)
    {
        map = _map;
        isMember = (checkedColl) => collection.Contains(checkedColl);
        genSet = () => collection;
    }

    public SetDescriptor(Dictionary<String, UtilCollection> _map, String name)
    {
        map = _map;
        isMember = (checkedColl) => map[name].Contains(checkedColl);
        genSet = () => map[name];
    }
    /*
        Func<UtilCollection, bool> _isMember = (a) => 
        Func<UtilCollection> _genSet = () =>
        return new SetDescriptor(_isMember, _genSet);
    */


    public SetDescriptor Cross(SetDescriptor other)
    {
        Func<UtilCollection, bool> _isMember = (a) => isMember(a[0]) && other.isMember(a[1]);
        Func<UtilCollection> _genSet = () => genSet().Cross(other.genSet());
        return new SetDescriptor(map, _isMember, _genSet);
    }

    public SetDescriptor Union(SetDescriptor other)
    {
        
        Func<UtilCollection, bool> _isMember = (a) => isMember(a) || other.isMember(a);
        Func<UtilCollection> _genSet = () => genSet().Union(other.genSet());
        return new SetDescriptor(map, _isMember, _genSet);
    }

    public SetDescriptor Intersect(SetDescriptor other)
    {
        Func<UtilCollection, bool> _isMember = (a) => isMember(a) && other.isMember(a);
        Func<UtilCollection> _genSet = () => genSet().Intersect(other.genSet());
        return new SetDescriptor(map, _isMember, _genSet);
    }

}