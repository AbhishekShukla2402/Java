package Arrays;

import java.util.HashSet;
import java.util.Set;

public class TD_arrays_2 {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,-4,2,3,4,-5};

        Set<Integer> set = new HashSet<Integer>();
        int sum=0;
        set.add(0);

        for(int i=0; i<arr.length; i++)
        {
            if(set.contains(sum))
            {
                System.out.println("YES");
                System.exit(0);
            }
            else
            {
                set.add(sum);
            }
        }
        System.out.println("NO");

    }
}
