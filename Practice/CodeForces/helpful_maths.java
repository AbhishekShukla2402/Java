import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class helpful_maths {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("\\+");

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<str.length; i++)
        {
            if(map.isEmpty())
            {
                map.put(Integer.parseInt(str[i]), 1);
            }
            else if(!map.containsKey((Integer)Integer.parseInt(str[i])))
            {
                map.put(Integer.parseInt(str[i]), 1);
            }
            else if(map.containsKey((Integer)Integer.parseInt(str[i])))
            {
                map.put(Integer.parseInt(str[i]), map.get(Integer.parseInt(str[i]))+1);
            }
        }


        int k=0;
        while(!map.isEmpty()) {

            int min=Integer.MAX_VALUE;
            for (int num : map.keySet()) {
                if(num<min)
                {
                    min=num;
                }
            }


            for(int i=0; i<map.get((Integer)min); i++)
            {
                str[k]=Integer.toString(min);
                k+=1;
            }
            map.remove((Integer) min);

        }
        String res="";

        for(int i=0; i<str.length; i++)
        {
            res+=str[i]+"+";
        }
        System.out.print(res.substring(0,res.length()-1));

    }

}
