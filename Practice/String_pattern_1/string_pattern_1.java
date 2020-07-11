import java.util.Scanner;
import java.util.*;
public class string_pattern_1
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        String str1 = "abcd";
        String new_str1="";
        //System.out.println("Enter number of iterations: ");
        //int n = sc.nextInt();
        int ctr=0;


        for(int i=0; i<str1.length(); i++)
        {
            ctr=0;
            while((i+1)<=str1.length() && ctr<i+1)
            {
                new_str1 = new_str1 + str1.substring(i,i+1);
                ctr++;
            }
        }

        System.out.println(new_str1);


    }

}
