package Map2;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map= new HashMap<String, Integer>();
        for(String word: strings)
        {
            if(!map.containsKey(word))
            {
                map.put(word,1);
            }
            else
            {
                int tmp = map.get(word);
                map.put(word, tmp+1);
            }
        }
        return map;

    }
}
