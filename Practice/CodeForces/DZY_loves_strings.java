import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZY_loves_strings {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        int max=0;

        for(int i=0; i<arr.length; i++)
        {
            if(Integer.parseInt(arr[i])>max)
            {
                max=Integer.parseInt(arr[i]);
            }
        }

        int val = 0;

        for(int i=0; i<str.length(); i++)
        {
            val+= Integer.parseInt(arr[str.charAt(i)-'a'])*(i+1);
        }

        int ctr=str.length()+1;

        while(ctr<=str.length()+k)
        {
            val+=ctr*max;
            ctr++;
        }

        System.out.println(val);

    }
}
