package Recursion1;

public class noX {
    public String noX(String str) {
        if(str.length()==0)
        {
            return "";
        }

        if(str.charAt(0)=='x')
        {
            return noX(str.substring(1, str.length()));
        }
        return str.charAt(0)+noX(str.substring(1,str.length()));

    }
}
