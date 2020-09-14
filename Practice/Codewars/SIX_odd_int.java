import java.util.HashMap;

public class SIX_odd_int {
    public static void main(String[] args)
    {
        int[] arr={20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: arr)
        {
            if(map.isEmpty())
            {
                map.put(num,1);
            }
            else if(map.containsKey(num))
            {
                map.put(num, map.get(num)+1);
            }
            else if(!map.containsKey(num))
            {
                map.put(num, 1);
            }
        }

        for(int key: map.keySet())
        {
            if(map.get(key)%2!=0)
            {
                System.out.println(key);
            }
        }
    }


}
