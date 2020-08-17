package Recursion1;

public class changePi {
    public String changePi(String str) {

        if(str.length()==0)
        {
            return "";
        }

        if(str.length()>=2 && str.substring(0,2).equals("pi"))
        {
            return "3.14"+changePi(str.substring(2, str.length()));
        }

        return str.charAt(0)+changePi(str.substring(1, str.length()));

    }

}
