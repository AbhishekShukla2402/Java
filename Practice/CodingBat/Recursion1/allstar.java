package Recursion1;

public class allstar {
    public String allStar(String str) {
        if(str.length()==0)
        {
            return "";
        }

        if(str.length()==1)
        {
            return str.substring(0,1);
        }

        return str.charAt(0)+"*"+allStar(str.substring(1,str.length()));
    }

}
