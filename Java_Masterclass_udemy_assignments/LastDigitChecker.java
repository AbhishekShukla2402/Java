public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c)
    {
        if(!isValid(a) || !isValid(b) || !isValid(c))
        {
            return false;
        }
        else
        {
            int ld1 = a%10;
            int ld2 = b%10;
            int ld3 = c%10;

            if((ld1==ld2 || ld2==ld3 || ld3==ld1))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public static boolean isValid(int a)
    {
        if(a<10 || a>1000){return false;}
        else{return true;}

    }
}