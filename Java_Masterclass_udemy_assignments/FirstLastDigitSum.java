public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number)
    {
        if(number<0)
        {
            return -1;
        }
        else {
            int ctr = 0;
            int tmp = number;
            while (tmp > 0) {
                ctr += 1;
                tmp = tmp / 10;
            }

            int first_digit = (int)(number/(Math.pow(10,ctr-1)));
            int last_digit = (int)(number%10);
            return first_digit+last_digit;
        }

    }
}