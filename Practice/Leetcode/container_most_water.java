public class container_most_water {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,18,17,6};

        int a_pointer=0;
        int b_pointer=arr.length-1;
        int product=1;
        int max=Integer.MIN_VALUE;


        while(a_pointer<b_pointer && a_pointer<arr.length && b_pointer<arr.length)
        {
            int len = b_pointer-a_pointer;
            if(arr[a_pointer]>=arr[b_pointer])
            {
                product = arr[b_pointer]*len;
            }
            else
            {
                product = arr[a_pointer]*len;
            }
            System.out.println(product);
            max=Math.max(max, product);
            product=1;

            if(arr[a_pointer]<arr[b_pointer])
            {
                a_pointer++;
            }
            else
            {
                b_pointer--;
            }

        }

        System.out.println(max);



    }

}
