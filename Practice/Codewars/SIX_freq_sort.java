import java.util.HashMap;

public class SIX_freq_sort {


    static int[] max_in_map(HashMap<Integer, Integer> map)
    {

        int max=0;
        int max_key=0;
        int[] ans=new int[2];
        for(int num: map.keySet())
        {
            if(map.get((Integer) num)>max)
            {
                max=map.get((Integer) num);
                max_key=num;
            }
            else
                 if(map.get((Integer) num)==max)
                 {
                     if(num<max_key)
                     {
                         max=map.get((Integer) num);
                         max_key=num;
                     }
                 }
        }

        map.remove((Integer) max_key);
        ans[0]=max_key;
        ans[1]=max;
        return ans;
    }

    public static void main(String[] arg)
    {
        int[] arr = {1, 2, 3, 0, 5, 0, 1, 6, 8, 8, 6, 9, 1};

        HashMap<Integer, Integer> map=new HashMap<>();

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

        int[] key=new int[2];
        int k=0;

        while(!map.isEmpty())
        {
            key = max_in_map(map);
            System.out.println(key[0]+" "+key[1]);
            int ctr=key[1];
            while(ctr>0)
            {
                arr[k]=key[0];
                k++;
                ctr--;
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
