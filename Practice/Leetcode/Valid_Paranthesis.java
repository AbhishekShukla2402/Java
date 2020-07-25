import java.util.*;


public class Valid_Paranthesis {

    public static void main(String[] args)
    {
        String str = "(]";
        ArrayList<Character> list = new ArrayList<Character>(str.length()-1);
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{')
            {
                list.add(str.charAt(i));
            }
            else
            {
                if(list.isEmpty())
                {
                    System.out.println("Unbalanced");
                    System.exit(0);
                }
                char tmp = list.get(list.size()-1);
                if(tmp == '(' && str.charAt(i)!=')')
                {
                    System.out.println("Unbalanced");
                    System.exit(0);
                }
                else if(tmp == '{' && str.charAt(i)!='}')
                {
                    System.out.println("Unbalanced");
                    System.exit(0);
                }
                else if(tmp == '[' && str.charAt(i)!=']')
                {
                    System.out.println("Unbalanced");
                    System.exit(0);
                }
                else
                {
                    list.remove(list.size()-1);
                }

            }
        }
        if(!list.isEmpty())
        {
            System.out.println("Unbalanced");
        }
        else
        {
            System.out.println("Balanced");
        }
    }
}
