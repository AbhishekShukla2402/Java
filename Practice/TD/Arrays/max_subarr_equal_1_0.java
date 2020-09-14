package Arrays;

import java.util.HashMap;

public class max_subarr_equal_1_0 {

    public static void main(String[] args)
    {
        int[] arr={0,0,0,1,1,1,1,1,1};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(0,-1);
        int sum=0;
        int len=0;
        int end_index=-1;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)
            {
                arr[i]=-1;
            }
        }


        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }

            else if(map.containsKey(sum) && len<i-map.get(sum))
            {
                len=i-map.get(sum);
                end_index=i;
            }
        }
        System.out.println(end_index-len+1 + " "+ end_index);
    }
}
