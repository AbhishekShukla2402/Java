public class contains_duplicate_3 {

    static boolean solve(int[]  arr, int a, int b, int t,int k)
    {
        for(int i=a; i<=b; i++)
        {
            for(int j=i+1; j<=b; j++)
            {
                if(i<=arr.length-1 && j<=arr.length-1 && Math.abs(arr[i]-arr[j])<=t)
                {
                    System.out.println(arr[i]+" "+arr[j]+" "+i+" "+j);
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args)
    {
        int[] arr = {-2147483648,2147483647};
        int k=1;
        int t=1;

        for(int i=0; i<arr.length; i++)
        {
            int j=i+k;
            if(solve(arr,i,j,t,k))
            {
                System.out.println("True");
                System.exit(0);
            }
        }

        System.out.println("False");

    }

}
