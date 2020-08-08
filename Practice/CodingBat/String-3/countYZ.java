import java.util.*;

public class countYZ {
    public static void main(String[] args)
    {
        String str="day:fez:wez dez";
        int ctr=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='y' || str.charAt(i)=='z' || str.charAt(i)=='Z' || str.charAt(i)=='Y')
            {
                if(i==str.length()-1 || !Character.isLetter(str.charAt(i+1)))
                {
                    ctr++;
                }
            }
        }


        System.out.println(ctr);

    }
}
