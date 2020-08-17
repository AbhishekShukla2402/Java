public class count_primes {
    public static int countPrimes(int n) {

        if(n<=2)
        {
            return 0;
        }
        if(n==3)
        {
            return 1;
        }

        int ctrp=0;
        for(int i=3; i<n; i++)
        {
            int flag=0;
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                ctrp++;
            }
        }
        return ctrp+1;

    }

    public static void main(String[] args)
    {
        int num;
        num=countPrimes(499979);
        System.out.println(num);
    }
}
