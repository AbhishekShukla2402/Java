import java.util.HashMap;

public class first_last_X_sorted_array {

    public static void main(String[] args)
    {
        int[] arr = {5,7,7,8,8,10};
        HashMap<Integer, Integer> map = new HashMap<>();
        int target=8;
        int start=-1;
        int end=-1;


        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target)
            {
                if(map.isEmpty())
                {
                    map.put(arr[i], i);
                    start = i;
                }
                else
                {
                    map.put(arr[i], i);
                }
            }
        }



        end = map.get((Integer) target);
        System.out.println(start + " " + end);
    }
}
