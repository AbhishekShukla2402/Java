import java.util.HashMap;
import java.util.HashSet;

public class expr_solver {

    static String OF_to_mult(String expr)
    {
        String tmp_modified_expr="";

        HashSet<Character> op_set = new HashSet<>();
        op_set.add('+');
        op_set.add('-');
        op_set.add('*');
        op_set.add('/');


        for(int i=0; i<expr.length(); i++)
        {
            if(i+1<=expr.length()-1 && ((Character.isDigit(expr.charAt(i)) && expr.charAt(i+1)=='(')))
            {
                tmp_modified_expr+= expr.charAt(i)+"X";
            }
            else if(i-1>=0 && ((Character.isDigit(expr.charAt(i)) && expr.charAt(i-1)==')')))
            {
                tmp_modified_expr+= "X" + expr.charAt(i);
            }

            else
            {
                tmp_modified_expr+= expr.charAt(i);
            }

        }
        return tmp_modified_expr;
    }

    public static void main(String[] args)
    {
        String expression="4(2*3(4)2)4";
        System.out.println(OF_to_mult(expression));
    }
}
