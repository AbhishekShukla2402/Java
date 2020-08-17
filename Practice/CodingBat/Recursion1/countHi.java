package Recursion1;

public class countHi {
    public int countHi(String str) {

        if(str.length()==0)
        {
            return 0;
        }

        if(str.length()>=2 && str.substring(str.length()-2, str.length()).equals("hi"))
        {
            return 1+countHi(str.substring(0,str.length()-1));
        }

        return countHi(str.substring(0, str.length()-1));

    }
}
