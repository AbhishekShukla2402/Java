import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bear_and_Big_Bro {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int w_l = Integer.parseInt(arr[0]);
        int w_b = Integer.parseInt(arr[1]);

        int ctr=0;

        while(w_l<=w_b)
        {
            ctr++;
            w_l=w_l*3;
            w_b=w_b*2;
        }

        System.out.println(ctr);
    }
}
