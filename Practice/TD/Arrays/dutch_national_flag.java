package Arrays;

import java.util.HashMap;

public class dutch_national_flag {

    public static void main(String[] args)
    {
        int[] arr = {1,2,0,2,1,0,1,2,2};
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<arr.length; i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], 1);
            }
            else
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        int k=0;
        if(!map.isEmpty())
        {
            while(map.get((Integer) 0)>0)
            {
                arr[k]=0;
                k+=1;
                map.put((Integer) 0, map.get((Integer)0)-1);
            }
            while(map.get((Integer) 1)>0)
            {
                arr[k]=1;
                k+=1;
                map.put((Integer) 1, map.get((Integer)1)-1);
            }
            while(map.get((Integer) 2)>0)
            {
                arr[k]=2;
                k+=1;
                map.put((Integer) 2, map.get((Integer)2)-1);
            }

        }


        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
