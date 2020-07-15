import java.util.Scanner;

import java.util.*;
import java.util.ArrayList;
public class rdce
{
    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args)
    {
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        ArrayList<Character> list = new ArrayList<Character>();

        for(int i=0; i<str.length();i++)
        {
            if(!list.contains(str.charAt(i)))
            {
                list.add(str.charAt(i));
            }
            else
            {
                if(list.get(list.size()-1) == str.charAt(i))
                {
                    list.remove(list.size()-1);
                }
                else
                {
                    list.add(str.charAt(i));
                }
            }
        }

        System.out.println(list);

    }
}
