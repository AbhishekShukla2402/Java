package Recursion1;

public class endX {
    public String endX(String str) {
        if(str.length()==0)
        {
            return "";
        }

        if(str.charAt(0)!='x')
        {
            return str.charAt(0)+endX(str.substring(1,str.length()));
        }

        return endX(str.substring(1,str.length()))+"x";
    }

}