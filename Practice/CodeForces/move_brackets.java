import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class move_brackets {

    static int check_stack(String str)
    {
        List<Character> stack = new ArrayList<Character>();
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='(')
            {
                stack.add(str.charAt(i));
            }
            else if(str.charAt(i)==')' && !stack.isEmpty())
            {
                stack.remove(stack.size()-1);
            }
        }

        return stack.size();
    }


    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc  = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++)
        {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            System.out.println(check_stack(str));
        }

    }
}
