using System.Collections.Generic;


class tester
{
List<string> setCoverInstances = new(){"({1,2,3},{{1,2},{2,3},{1,3}})"};

    public tester()
    {
        testSetCover2();
    }

    private string HashSetToString(HashSet<string> set)
    {
        string str = "{";

        foreach (string s in set)
            str += s + ",";
        str += "}";
        return str;
    }

    private string HashSetHashSetToString(HashSet<HashSet<string>> set)
    {
        string str = "{";

        foreach (HashSet<string> s in set)
            str += HashSetToString(s) + ",";
        str += "}";
        return str;
    }

    private void testSetCover()
    {
        bool passed = true;
        foreach (string instance in setCoverInstances)
        {
            UtilCollection truth = new UtilCollection(instance);
            HashSet<string> U = new();
            foreach (UtilCollection i in truth[0])
            {
                U.Add(i.ToString());
            }
            HashSet<HashSet<string>> S = new();
            foreach (UtilCollection i in truth[1])
            {
                HashSet<string> subset = new();
                foreach (UtilCollection j in i)
                {
                    subset.Add(j.ToString());
                }
                S.Add(subset);
            }

            if (SetCoverCS.test)
            {
                SetCoverCS setcovercs = new(instance);
                if (U != setcovercs.U)
                {
                    Console.WriteLine($"SetCoverCS failed, U is incorrect, it is {HashSetToString(setcovercs.U)}, should be {HashSetToString(U)} with the instance string {instance}");
                    passed = false;
                }
                if (S != setcovercs.S)
                {
                    Console.WriteLine($"SetCoverCS failed, S is incorrect, it is {HashSetHashSetToString(setcovercs.S)}, should be {HashSetHashSetToString(S)} with the instance string {instance}");
                    passed = false;
                }
            }


        }

        if (passed)
        {
            Console.WriteLine("SetCover classes passed!");
        }
    }

    private void testSetCover2()
    {
        bool passed = true;
        foreach (string instance in setCoverInstances)
        {
            UtilCollection truth = new UtilCollection(instance);
            UtilCollection U = truth[0];
            UtilCollection S = truth[1];

            if (SetCoverCS.test)
            {
                SetCoverCS setcovercs = new(instance);
                UtilCollection UCS = new UtilCollection(setcovercs.U);
                UtilCollection SCS = new UtilCollection(setcovercs.S);
                if (UCS.NotEquals(U))
                {
                    Console.WriteLine($"SetCoverCS failed, U is incorrect, it is {UCS}, should be {U} with the instance string {instance}");
                    passed = false;
                }
                if (SCS.NotEquals(S))
                {
                    Console.WriteLine($"SetCoverCS failed, S is incorrect, it is {SCS}, should be {S} with the instance string {instance}");
                    passed = false;
                }
            }


        }

        if (passed)
        {
            Console.WriteLine("SetCover classes passed!");
        }
    }

}