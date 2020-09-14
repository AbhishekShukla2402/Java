
//DIDNT WORK FOR SOME EDGE CASES :(


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class String_similarity {

    static boolean match(String tmp, String common)
    {
        for(int i=0; i<common.length(); i++)
        {
            if(tmp.charAt(i)==common.charAt(i))
            {
                return true;
            }
        }

        return false;
    }



    static String process(String str, String common)
    {

        int common_pointer = 0;
        int a_pointer=0;
        int b_pointer=common.length();
        String res=common;

        while(b_pointer<=str.length())
        {
            String tmp = str.substring(a_pointer,b_pointer);
            //System.out.println(tmp);
            if(match(tmp, common))
            {
                a_pointer+=1;
                b_pointer+=1;
            }
            else
            {
                if(common.charAt(common_pointer)=='1')
                {
                    char[] tmp_arr = common.toCharArray();
                    tmp_arr[common_pointer]='0';
                    res = new String(tmp_arr);
                }
                else
                {
                    char[] tmp_arr = common.toCharArray();
                    tmp_arr[common_pointer]='1';
                    res = new String(tmp_arr);
                    System.out.println(res);
                }
                a_pointer+=1;
                b_pointer+=1;
                common_pointer+=1;
            }

        }
        return res;

    }



    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i=0; i<tc; i++)
        {
            int k=Integer.parseInt(br.readLine());
            String str = br.readLine();
            String common = str.substring(0,k);
            System.out.println(process(str, common));
        }
    }
}
