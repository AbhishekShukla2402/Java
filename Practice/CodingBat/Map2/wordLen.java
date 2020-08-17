package Map2;

import java.util.HashMap;
import java.util.Map;

public class wordLen {
    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map= new HashMap<String, Integer>();
        for(String word: strings)
        {
            if(!map.containsKey(word))
            {
                map.put(word, word.length());
            }
        }
        return map;
    }

}
