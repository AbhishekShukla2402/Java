public class countTriple {

    public int countTriple(String str) {
        if(str.length()<=2)
        {
            return 0;
        }
        int ctr=0;

        for(int i=0; i<str.length(); i++)
        {
            if(i+2<=str.length()-1)
            {
                if(str.charAt(i+1)==str.charAt(i) && str.charAt(i+2)==str.charAt(i))
                {
                    ctr++;
                }
            }
        }
        return ctr;

    }
}
