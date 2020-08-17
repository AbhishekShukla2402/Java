package Map2;

import java.util.HashMap;
import java.util.Map;

public class pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();

        String result;
        for(String word: strings)
        {
            if(!map.containsKey(word.charAt(0)))
            {
                map.put(word.substring(0,1), word.substring(word.length()-1, word.length()));
            }
        }
        return map;
    }

}
