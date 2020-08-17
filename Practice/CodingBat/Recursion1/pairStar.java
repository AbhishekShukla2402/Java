package Recursion1;

public class pairStar {
    public String pairStar(String str) {
        if(str.length()==0)
        {
            return "";
        }

        if(str.length()>=2 && str.charAt(0)==str.charAt(1))
        {
            return str.charAt(0)+"*"+pairStar(str.substring(1,str.length()));
        }

        return str.charAt(0)+pairStar(str.substring(1,str.length()));
    }
}
