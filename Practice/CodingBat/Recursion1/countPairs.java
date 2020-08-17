package Recursion1;

public class countPairs {
    public int countPairs(String str) {
        if(str.length()<3)
        {
            return 0;
        }

        if(str.length()>=3 && str.charAt(0)==str.charAt(2))
        {
            return 1+countPairs(str.substring(1,str.length()));
        }

        return countPairs(str.substring(1,str.length()));
    }
}
