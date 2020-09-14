import java.util.ArrayList;

public class Letter_Case_Permutation {

    public static void main(String[] args)
    {
        String str="a1b2";
        ArrayList<String> list = new ArrayList<>();

        int ctr=0;
        int k=0;
        while(ctr<str.length())
        {
            String tmp="";
            if(k<str.length()-1 && !Character.isDigit(str.charAt(k)))
            {
                tmp=str.substring(0,k)+Character.toUpperCase(k)+str.substring(k+1);
            }
            else if(k==str.length()-1 && !Character.isDigit(str.charAt(k)))
            {
                tmp=str.substring(0,k)+Character.toUpperCase(str.charAt(k));
            }
            else
            {
                tmp
            }
        }
    }
}
