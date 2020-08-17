package Recursion1;

public class count11 {
    public int count11(String str) {

        if(str.length()<2)
        {
            return 0;
        }

        if(str.length()>=2 && str.substring(0,2).equals("11"))
        {
            return 1+count11(str.substring(2,str.length()));
        }

        return count11(str.substring(1,str.length()));

    }
}
