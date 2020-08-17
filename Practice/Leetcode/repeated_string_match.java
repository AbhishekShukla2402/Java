public class repeated_string_match {
    public int repeatedStringMatch(String A, String B) {
        String rep=A;
        int ctr=1;

        while(rep.length()<B.length())
        {
            ctr+=1;
            rep+=A;
        }

        if(rep.contains(B))
        {
            return ctr;
        }

        rep=rep+A;
        ctr+=1;
        if(rep.contains(B))
        {
            return ctr;
        }
        else
        {
            return -1;
        }

    }
}
