package Recursion1;

public class sumDigits {
    public int sumDigits(int n) {
        if(n==0)
        {
            return 0;
        }

        int digit=n%10;
        n=n/10;
        return digit+sumDigits(n);

    }
}
