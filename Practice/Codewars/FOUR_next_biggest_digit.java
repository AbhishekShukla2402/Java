public class FOUR_next_biggest_digit {

    public static void main(String[] args)
    {
        long num=1234567890;
        char[] arr = Long.toString(num).toCharArray();

        boolean flag=true;
        for(int i=arr.length-1; i>=0; i--)
        {
            if(i-1>=0 && (int)arr[i]>(int)arr[i-1])
            {
                char tmp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=tmp;

                break;
            }

            if(i==0)
            {
                flag=false;
            }

        }

        if(flag==false)
        {
            System.out.println(-1);
        }

        String res="";

        for(int i=0; i<arr.length; i++)
        {
            res+=arr[i];
        }

        System.out.println(Integer.parseInt(res));

    }
}
