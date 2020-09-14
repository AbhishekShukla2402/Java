import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Queue_at_school {

    static String solve(String str)
    {
        char[] char_arr = str.toCharArray();
        for(int i=1; i<char_arr.length; i++)
        {
            if(char_arr[i]=='G' && char_arr[i-1]=='B')
            {

                char tmp = char_arr[i-1];
                char_arr[i-1]=char_arr[i];
                char_arr[i]=tmp;
                i++;
            }
        }

        return String.valueOf(char_arr);
    }


    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        long ctr = Long.parseLong(arr[1]);
        String str = br.readLine();

        for(long i=0; i<ctr; i++)
        {
            str = solve(str);
            //System.out.println(str);
        }

        System.out.println(str);

    }

}
