import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_duplicates_from_sorted_array {

    public static int remove_duplicates(int[] arr)
    {
        int index = 1;

        for(int i = 0; i<arr.length-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[index] = arr[i+1];
                index+=1;
            }
        }
        return index;
    }



    public static void main(String[] args)
    {
        int[] arr  = {1,2,3,4,4,5,5,5,6,7,8,8};
        int len = remove_duplicates(arr);
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }

    }


}
