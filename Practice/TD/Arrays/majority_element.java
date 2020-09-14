package Arrays;

import java.util.HashMap;

public class majority_element {

    public static void main(String[] args)
    {
        int[] arr ={2,8,7,2,2,5,2,3,1,2,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        for(int key: map.keySet())
        {
            if(map.get(key)>=arr.length/2)
            {
                System.out.println(key);
                System.exit(0);
            }
        }

        System.out.println("No majority vote found");

    }
}
