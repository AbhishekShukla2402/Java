import java.util.Scanner;

import java.util.*;
import java.util.ArrayList;
public class test2
{
    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args)
    {
        String str1 = "((())){}[]{)";
        ArrayList<Character> stack = new ArrayList<Character>();

        for(int i=0; i<str1.length(); i++)
        {
            if(str1.charAt(i)=='(' || str1.charAt(i) == '{' || str1.charAt(i) == '[')
            {
                stack.add(str1.charAt(i));
            }
            else
            {
                if(stack.isEmpty())
                {
                    System.out.println("Unbalanced");
                    System.exit(0);
                }


                char tmp = stack.get(stack.size()-1);
                if(str1.charAt(i)==')' && tmp != '(')
                {
                    System.out.println("Unbalanced");
                    System.exit(0);
                }
                else{stack.remove(stack.size()-1); continue;}





                if(str1.charAt(i)==']' && tmp != '[')
                {
                    System.out.println("Unbalanced");
                    System.exit(0);
                }
                else{stack.remove(stack.size()-1); continue;}




                if(str1.charAt(i)=='}' && tmp != '{')
                {
                    System.out.println("Unbalanced");
                    System.exit(0);
                }
                else{stack.remove(stack.size()-1);continue;}



            }
        }
        System.out.println(stack);
        if(!stack.isEmpty())
        {
            System.out.println("Unbalanced");
        }
        else
        {
            System.out.println("Balanced");
        }

    }
}


