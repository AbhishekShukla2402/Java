import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Bear_5_cards {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            if(map.isEmpty())
            {
                map.put(Integer.parseInt(arr[i]),1);
            }
            else if(!map.containsKey(Integer.parseInt(arr[i])))
            {
                map.put(Integer.parseInt(arr[i]),1);
            }
            else if(map.containsKey(Integer.parseInt(arr[i])))
            {
                map.put(Integer.parseInt(arr[i]),map.get(Integer.parseInt(arr[i]))+1);
            }
        }

        //System.out.println(map);

        int max_key=0;
        int max_sum=0;
        int run_sum;

        for(int num: map.keySet())
        {
            run_sum=0;
            if(map.get(num)>1)
            {
                int ctr=0;
                while(ctr<map.get(num) && ctr<3)
                {
                    run_sum+=num;
                    ctr++;
                }

                if(run_sum>max_sum)
                {
                    max_key=num;
                    max_sum=run_sum;
                }
            }
        }


        int f_sum=0;

        for(int num: map.keySet())
        {
            f_sum+=(num*map.get(num));
        }

        System.out.println(f_sum-max_sum);


    }

}
