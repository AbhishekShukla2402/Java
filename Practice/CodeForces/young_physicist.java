import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class young_physicist {



    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        long sum_x=0;
        long sum_y=0;
        long sum_z=0;

        for(int i=0; i<tc; i++)
        {
            String[] arr = br.readLine().split(" ");
            sum_x+=Long.parseLong(arr[0]);
            sum_y+=Long.parseLong(arr[1]);
            sum_z+=Long.parseLong(arr[2]);

        }

        if(sum_x==0 && sum_y==0 && sum_z==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
