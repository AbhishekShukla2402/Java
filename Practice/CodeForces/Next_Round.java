import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Next_Round {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr1 = br.readLine().split(" ");

        int len = Integer.parseInt(arr1[0]);
        int cutoff_p = Integer.parseInt((arr1[1]));

        String[] participants = br.readLine().split(" ");
        int cutoff_score = Integer.parseInt(participants[cutoff_p-1]);

        int ctr=0;

        for(int i=0; i<participants.length; i++)
        {
            if(Integer.parseInt(participants[i])>=cutoff_score && Integer.parseInt(participants[i])>0)
            {
                ctr++;
            }
        }

        System.out.println(ctr);





    }

}
