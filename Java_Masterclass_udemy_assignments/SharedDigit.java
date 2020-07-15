public class SharedDigit
{
    public static boolean hasSharedDigit(int a, int b)
    {
        if((a<10 || a>99) || (b<10 || b>99))
        {
            return false;
        }
        else
        {
            // importing Arraylist throws an error on Udemy's compiler and I cant think of anything other than this bloatmax solution
            // Since there's only 4 digits in total a separate variable for each digit shouldn't be a problem
            int fd_first_number = a/10;
            int sd_first_number = a%10;
            int fd_second_number = b/10;
            int sd_second_number = b%10;

            if((fd_first_number==fd_second_number) || (sd_first_number==fd_second_number) || (fd_first_number==sd_second_number) || (sd_first_number==sd_second_number))
            {
                return true;
            }
            else
            {
                return false;
            }

        }

    }

}
