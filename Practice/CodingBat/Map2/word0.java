package Map2;

import java.util.HashMap;
import java.util.Map;

public class word0 {
    public Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map= new HashMap<String, Integer>();
        for(String word: strings)
        {
            map.put(word,0);
        }
        return map;

    }

}
