package Arrays;

import java.util.HashSet;

public class duplicate_element_array {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 5};
        HashSet<Integer> set = new HashSet<Integer>();

        for(int num : arr)
        {
           if(!set.contains(num))
           {
               set.add(num);
           }
           else
           {
               System.out.println("Here's your duplicate bro: "+num);
           }
        }
    }
}
