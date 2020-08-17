package Recursion1;

public class count7 {
    public int count7(int n) {
        if(n==0)
        {
            return 0;
        }

        int ctr=0;
        if(n%10==7)
        {
            ctr+=1;
        }
        n=n/10;
        return ctr+count7(n);
    }
}
