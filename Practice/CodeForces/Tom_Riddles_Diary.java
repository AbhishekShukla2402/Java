import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Tom_Riddles_Diary {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());



        for(int i=0; i<n; i++)
        {
            String input = br.readLine();
            if(set.isEmpty())
            {
                System.out.println("NO");
                set.add(input);
            }
            else if(set.contains(input))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
                set.add(input);
            }
        }

    }

}
