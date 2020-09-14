import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wrong_subtratction {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int ctr = Integer.parseInt(str[1]);
        int num = Integer.parseInt(str[0]);

        for(int i=0; i<ctr; i++)
        {
            if(num%10!=0)
            {
                num=num-1;
            }
            else
            {
                num=num/10;
            }
        }

        System.out.println(num);
    }

}
