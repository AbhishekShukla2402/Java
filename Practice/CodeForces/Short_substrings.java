import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Short_substrings {

    static String solve(String str)
    {
        String res="";
        for(int i=0; i<str.length()-1; i++)
        {
            res+=str.charAt(i);
            i+=1;
        }

        return res+str.charAt(str.length()-1);
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++)
        {
            String word = br.readLine();
            System.out.println(solve(word));
        }
    }
}
