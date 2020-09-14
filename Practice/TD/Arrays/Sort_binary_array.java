package Arrays;

public class Sort_binary_array {

    public static void main(String[] args)
    {
        int[] arr={0,0,1,0,1,1,0,1,0,0};
        int k=arr.length-1;
        int ctr=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==1)
            {
                ctr+=1;
                arr[i]=0;
            }

        }

        for(int j=0; j<ctr; j++)
        {
            arr[k]=1;
            k-=1;
        }

        for(int j=0; j<arr.length; j++)
        {
            System.out.print(arr[j]);
        }





    }
}
