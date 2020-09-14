import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anton_or_Danik {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        String games = br.readLine();

        int ctra=0;
        int ctrd=0;

        for(int i=0; i<len; i++)
        {
            if(games.charAt(i)=='A')
            {
                ctra++;
            }
            else
            {
                ctrd++;
            }
        }

        if(ctra>ctrd)
        {
            System.out.println("Anton");
        }
        else if(ctrd>ctra)
            {
                System.out.println("Danik");
            }
        else
        {
            System.out.println("Friendship");
        }

    }


}
