package Arrays;


public class alternate_high_low {
    public static void swap(int a, int b)
    {
        int tmp=0;
        tmp=a;
        a=b;
        b=tmp;
    }




    public static void main(String[] args) {

        int[] arr1 = {9,6,8,3,7};
        int tmp=0;
        for (int i = 1; i < arr1.length; i+=2)
        {
            while(i+1<=arr1.length-1 && !(arr1[i]>=arr1[i-1] && arr1[i]>=arr1[i+1]))
            {
                if(arr1[i]<arr1[i-1])
                {
                    tmp = arr1[i];
                    arr1[i]=arr1[i-1];
                    arr1[i-1]=tmp;

                }
                else if(arr1[i]<arr1[i+1])
                {
                    tmp = arr1[i];
                    arr1[i]=arr1[i+1];
                    arr1[i+1]=tmp;
                }
            }
        }



        for (int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
