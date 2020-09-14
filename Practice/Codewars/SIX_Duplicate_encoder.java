import java.util.HashMap;
import java.util.HashSet;

public class SIX_Duplicate_encoder {

    public static void main(String[] args)
    {
        String str="Prespecialized";
        str=str.toLowerCase();
        String res="";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c: str.toCharArray())
        {
            if(map.isEmpty())
            {
                map.put(c,1);
            }
            else if(!map.containsKey(c))
            {
                map.put(c,1);
            }
            else
            {
                map.put(c,map.get(c)+1);
            }
        }

        for(char key: str.toCharArray())
        {
            if(map.get(key)>1)
            {
                res+=")";
            }

            if(map.get(key)==1)
            {
                res+="(";
            }
        }

        System.out.println(res);
        System.out.println(map);
    }
}
