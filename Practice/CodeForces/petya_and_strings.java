import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class petya_and_strings {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        String smaller="";

        if(str2.length()<str1.length())
        {
            smaller=str2;
        }
        else
        {
            smaller=str1;
        }

        for(int i=0; i<smaller.length(); i++)
        {
            if(str1.charAt(i)<str2.charAt(i))
            {
                System.out.println("-1");
                System.exit(0);
            }
            else if(str2.charAt(i)<str1.charAt(i))
            {
                System.out.println("1");
                System.exit(0);
            }
            else if(i==str1.length()-1 && i<str2.length()-1)
            {
                System.out.println("-1");
                System.exit(0);
            }
            else if(i==str2.length()-1 && i<str1.length()-1)
            {
                System.out.println("1");
                System.exit(0);
            }
        }

        System.out.println("0");

    }

}
