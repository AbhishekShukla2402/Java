package Arrays;

import java.util.HashMap;

public class max_continuous_subarr_sum {

    public static void main(String[] args)
    {
        int[] arr={2,-1,1,2,4,0,0,-1};

        HashMap<Integer, Integer> map=new HashMap<>();

        int sum=0;
        int max=Integer.MIN_VALUE;
        int start=0;
        int end=-1;

        int max_sum=arr[0];
        int cur_sum=max_sum;


        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>cur_sum+arr[i])
            {
                start=i;
            }
            cur_sum=Math.max(arr[i], cur_sum+arr[i]);

            if(cur_sum>max_sum)
            {
                end=i;
            }
            max_sum=Math.max(max_sum, cur_sum);
        }

        System.out.println(start+" "+end);

    }

}
