import java.util.HashMap;

public class Reorganized_string {
    static char get_character(String res, HashMap<Character, Integer> map)
    {
        if(res.length()==0)
        {
            int max=0;
            char max_char = '0';
            for(char key: map.keySet())
            {
                if(map.get(key)>max)
                {
                    max=map.get(key);
                    max_char = key;
                }
            }

            return max_char;
        }

        else if(res.length()>0 && !map.isEmpty())
        {
            int max=0;
            char max_char = res.charAt(res.length()-1);
            for(char key: map.keySet())
            {
                if(map.get(key)>max && key!=res.charAt(res.length()-1))
                {
                    max=map.get(key);
                    max_char = key;
                }
            }
            return max_char;
        }

        return res.charAt(res.length()-1);

    }




    public String reorganizeString(String str) {
        String res = "";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), 1);
            }
            else
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }

        for(int i=0; i<str.length(); i++)
        {
            char tmp = get_character(res, map);
            if(res.length()>0 && res.charAt(res.length()-1)!=tmp)
            {
                res+=tmp;
                map.put(tmp, map.get(tmp)-1);
            }
            else if(res.length()==0)
            {
                res+=tmp;
                map.put(tmp, map.get(tmp)-1);
            }
            else
            {
                return "";
            }
        }

        return res;


    }
}
