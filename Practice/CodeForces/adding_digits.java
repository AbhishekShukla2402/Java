import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


// Time limit exceeded :(
//At first try to add to the right one digit from 0 to 9.
// If it is impossible write -1. In other case, the remaining n–1 digits can be 0 because divisibility doesn’t change.

public class adding_digits {


    static BigInteger solve(String num1, String num21, String ctr1)
    {
        BigInteger n = new BigInteger("0");
        BigInteger ctr = new BigInteger(ctr1);
        BigInteger num2 = new BigInteger(num21);
        BigInteger num = new BigInteger(num1);

        while(n.compareTo(ctr)<0)
        {
            String res=num1;

            for(long i=0; i<=9; i++)
            {
                if(new BigInteger(res+i).mod(num2).compareTo(new BigInteger("0"))==0)
                {
                    res+=Long.toString(i);
                    break;
                }
            }
            if(num.compareTo(new BigInteger(res))==0)
            {
                return new BigInteger("-1");
            }
            num1 = res;
            n = n.add(new BigInteger("1"));
        }
        return new BigInteger(num1);
    }



    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        System.out.println(solve(arr[0],arr[1],arr[2]));

    }

}
