import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bit_plus_plus {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int tc= Integer.parseInt(br.readLine());
        int X=0;

        for(int i=0; i<tc; i++)
        {
            String input = br.readLine();

            if(input.equals("++X") || input.equals("X++"))
            {
                X+=1;
            }
            else
            {
                X-=1;
            }
        }

        System.out.println(X);

    }

}
