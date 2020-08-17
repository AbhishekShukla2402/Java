package Map2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public Map<String, String> firstChar(String[] strings) {

        String result="";
        Map<String, String> map = new HashMap<String, String>();

        for(String word: strings)
        {
            if(map.containsKey(word.substring(0,1)))
            {
                result=map.get(word.substring(0,1));
                result=result+word;
                map.put(word.substring(0,1),result);
            }
            else
            {
                map.put(word.substring(0,1), word);
            }
        }
        return map;

    }
}
