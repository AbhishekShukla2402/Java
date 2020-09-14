package Arrays;

public class missing_number {

    public static void main(String[] args) {

        int[] arr = {3,2,4,6,1};
        int start = 1;
        int end = 6;
        int sum = 0, arr_sum=0;


        for (int i = 1; i < end+1; i++) {
            sum += i;
        }

        for(int j=0; j<arr.length; j++)
        {
            arr_sum+=arr[j];
        }

        System.out.println((sum-arr_sum));



    }
}
