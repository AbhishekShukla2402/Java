package Arrays;

import java.util.HashMap;

public class Non_TD1 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 2, -3, 1, 4, 2};
        int ctr=0;
        int targ=7;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);
        for(int num: arr)
        {
            sum+=num;
            if(!map.containsKey(sum-targ))
            {
                map.put(sum,1);
            }
            else if(map.containsKey(sum-targ))
            {
                ctr+=1;
                map.put(sum,1);
            }

        }
        System.out.println(ctr);

    }
}
