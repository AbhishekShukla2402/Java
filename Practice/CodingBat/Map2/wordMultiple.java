package Map2;

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for(String word: strings)
        {
            if(map.containsKey(word))
            {
                map.put(word, true);
            }
            else
            {
                map.put(word, false);
            }
        }
        return map;
    }
}
