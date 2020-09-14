import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Borze {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String res="";

        for(int i=0; i<str.length();i++)
        {
            //System.out.println()
            if(i+2<=str.length() && str.substring(i,i+2).equals("-."))
            {
                res+="1";
                i+=1;
            }
            else if(i+2<=str.length() && str.substring(i,i+2).equals("--"))
            {
                res+="2";
                i+=1;
            }
            else if(str.substring(i,i+1).equals("."))
            {
                res+="0";
            }
        }

        System.out.println(res);

    }
}
