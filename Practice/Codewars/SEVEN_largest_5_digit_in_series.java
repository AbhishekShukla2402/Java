import java.util.ArrayList;

public class SEVEN_largest_5_digit_in_series {
    public static void main(String[] args)
    {
        String num="1234567890";
        String res="";
        int max=Integer.MIN_VALUE;
        int tmp=0;
        int k=5;

        for(int i=0; i<num.length(); i++)
        {
            if(i+k>num.length())
            {
                break;
            }
            tmp = Integer.parseInt(num.substring(i,i+k));

            if(tmp>max)
            {
                max=tmp;
            }
        }

        System.out.println(max);
    }

}
