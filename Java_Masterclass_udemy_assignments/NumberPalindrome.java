public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        number = Math.abs(number);
        int num = number;
        int rev=0;
        while(num>0)
        {
            int tmp = num%10;
            rev = rev*10 +tmp;
            num = num/10;
        }

        if(rev==number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
