public class pattern_132 {

    static int fmb(int a, int b, int[] arr)
    {
        int max=0;
        for(int i=a+1; i<b; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        return max;
    }


    public static void main(String[] args)
    {
        int[] arr = {3,1,4,2};

        int max=Integer.MIN_VALUE;
        int max_index=-1;

        for(int i=0; i<arr.length; i++ )
        {
            if(arr[i]>max)
            {
                max=arr[i];
                max_index=i;
            }
        }

        int a_pointer = 0;
        int b_pointer = arr.length-1;

        



        
    }

}
