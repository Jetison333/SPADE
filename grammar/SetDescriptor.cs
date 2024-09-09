

using System.Reflection.Metadata.Ecma335;

class SetDescriptor
{
    public Func<UtilCollection,bool> isMember;

    public Func<UtilCollection> genSet;

    public SetDescriptor()
    {
        isMember = (a) => false;
        genSet = () => new UtilCollection("");

    }

    public SetDescriptor(Func<UtilCollection,bool> _isMember, Func<UtilCollection> _genSet)
    {
        isMember = _isMember;
        genSet = _genSet;
    }
    public SetDescriptor(UtilCollection collection)
    {
        isMember = (checkedColl) => collection.Contains(checkedColl);
        genSet = () => collection;
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
        return new SetDescriptor(_isMember, _genSet);
    }

    public SetDescriptor Union(SetDescriptor other)
    {
        
        Func<UtilCollection, bool> _isMember = (a) => isMember(a) || other.isMember(a);
        Func<UtilCollection> _genSet = () => genSet().Union(other.genSet());
        return new SetDescriptor(_isMember, _genSet);
    }

    public SetDescriptor Intersect(SetDescriptor other)
    {
        Func<UtilCollection, bool> _isMember = (a) => isMember(a) && other.isMember(a);
        Func<UtilCollection> _genSet = () => genSet().Intersect(other.genSet());
        return new SetDescriptor(_isMember, _genSet);
    }

}