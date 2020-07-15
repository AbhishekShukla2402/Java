import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class test1 {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args)
    {
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split("")));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(str.split("")));
        Collections.reverse(list);
        if(list.equals(list2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println(list.get(1));
        }







    }
}
