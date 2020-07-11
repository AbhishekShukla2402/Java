import java.util.Scanner;
import java.util.*;
public class string_pattern_2
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        String str = "abcdefg uid fgh";
        String result="";
        for(int i =0; i<str.length();i++)
        {
            if(i%2!=0)
            {
                result += Character.toUpperCase(str.charAt(i));
            }
            else
            {
                result +=  str.charAt(i);
            }
        }
        System.out.println(result);

    }

}
