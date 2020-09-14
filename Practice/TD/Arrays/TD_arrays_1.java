package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TD_arrays_1 {

    public static void main(String[] args)
    {
        int[] arr={8,7,2,5,3,1};
        int low=0;
        int high=arr.length-1;
        int sum=23;

        Arrays.sort(arr);


        while(low<high)
        {
            if(arr[low]+arr[high]==sum)
            {
                System.out.println("Found");
                System.exit(0);
            }
            else if(arr[low]+arr[high]<sum)
            {

                low++;
            }
            else if(arr[low]+arr[high]>sum)
            {
                high--;
            }

        }

        System.out.println("Not found");




    }

}
