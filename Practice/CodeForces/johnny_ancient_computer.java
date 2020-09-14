import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class johnny_ancient_computer {

    static int solve(long num, long target)
    {
        int ctr=0;
        if(num==target)
        {
            return 0;
        }
        else if(num>target)
        {
            while(num>target)
            {
                if(num%8==0)
                {
                    num=num/8;
                    ctr++;
                }
                else if(num%4==0)
                {
                    num=num/4;
                    ctr++;
                }
                else if(num%2==0)
                {
                    num=num/2;
                    ctr++;
                }
                else
                {
                    return -1;
                }
            }
            if(num!=target)
            {
                return -1;
            }
            return ctr;
        }
        else if(num<target) {
            while (num < target) {
                if (target % 8 == 0) {
                    num = num * 8;
                    ctr++;
                } else if (target % 4 == 0) {
                    num = num * 4;
                    ctr++;
                } else if (target % 2 == 0) {
                    num = num * 2;
                    ctr++;
                } else {
                    return -1;
                }
            }
            if (num > target && (num/8!=target && num/4!=target && num/2!=target)) {
                return -1;
            }
            return ctr;
        }

        return -1;
    }





    public static void main(String[] arg) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++)
        {
            String[] str = br.readLine().split(" ");

            System.out.println(solve(Long.parseLong(str[0]), Long.parseLong(str[1])));
        }

    }

}
