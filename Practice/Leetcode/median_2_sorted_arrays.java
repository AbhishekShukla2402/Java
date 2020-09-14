public class median_2_sorted_arrays {

    public static void main(String[] args)
    {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        int[] sorted_arr = new int[arr1.length+arr2.length];

        int pointer_1=0;
        int pointer_2=0;

        for(int i=0; i<sorted_arr.length; i++)
        {
            if(pointer_1<arr1.length && pointer_2<arr2.length && arr1[pointer_1]<arr2[pointer_2])
            {
                sorted_arr[i] = arr1[pointer_1];
                pointer_1+=1;
            }

            else if(pointer_1<arr1.length && pointer_2<arr2.length && arr1[pointer_1]>arr2[pointer_2])
            {
                sorted_arr[i] = arr2[pointer_2];
                pointer_2+=1;
            }

            else if(pointer_1<arr1.length && pointer_2<arr2.length && arr1[pointer_1]==arr2[pointer_2])
            {
                sorted_arr[i] = arr1[pointer_1];
                pointer_1+=1;
                i+=1;
                sorted_arr[i] = arr2[pointer_2];
                pointer_2+=1;
            }
            else if(pointer_1<arr1.length && pointer_2>=arr2.length)
            {
                sorted_arr[i] = arr1[pointer_1];
                pointer_1+=1;
            }
            else if(pointer_1>=arr1.length && pointer_2<arr2.length)
            {
                sorted_arr[i] = arr2[pointer_2];
                pointer_2+=1;
            }
        }


        double median =0.0;

        if(sorted_arr.length%2!=0)
        {
            median = sorted_arr[(sorted_arr.length-1)/2];
        }
        else
        {
            median = (double)(sorted_arr[(sorted_arr.length)/2] + sorted_arr[((sorted_arr.length)/2)-1])/2;
        }

        System.out.println(median);
    }
}
