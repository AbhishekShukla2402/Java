import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[3];

        int tn = 0;

        for(int i=0; i<n; i++)
        {
            int ctr=0;
            String str = br.readLine();
            arr = str.split(" ");
            for(int j=0; j<arr.length; j++)
            {
                if(Integer.parseInt(arr[j])==0)
                {
                    ctr+=1;
                }
            }
            if(ctr<=1)
            {
                tn++;
            }

        }
        System.out.println(tn);


    }

}
