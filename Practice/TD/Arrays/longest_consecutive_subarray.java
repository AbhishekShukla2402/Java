package Arrays;

import java.util.HashSet;

public class longest_consecutive_subarray {

    static boolean ifConsec(int[] arr, int i, int j,int max, int min)
    {
        if(max-min!=j-i)
        {
            return false;
        }

        HashSet<Integer> set = new HashSet<Integer>();

        for(int k=i; k<=j; k++)
        {
            if(!set.contains(arr[k]))
            {
                set.add(arr[k]);
            }

            else
            {
                return false;
            }
        }

        return true;


    }




    public static void main(String[] args)
    {
        int[] arr={2,0,2,1,4,3,1,0};

        int start=0;
        int end=0;
        int len=0;

        for(int i=0; i<arr.length-1; i++)
        {
            int max=arr[i];
            int min=arr[i];

            for(int j=i+1; j<arr.length; j++)
            {
                max=Math.max(max, arr[j]);
                min=Math.min(min, arr[j]);

                if(ifConsec(arr,i,j,max,min))
                {
                  if(len<j-i+1)
                  {
                      start=i;
                      end=j;
                      len=j-i+1;
                  }
                }
            }
        }

        System.out.println(start+" "+end);
    }

}
