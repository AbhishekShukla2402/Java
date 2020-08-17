package Map2;

import java.util.HashMap;
import java.util.Map;

public class wordAppend {
    public String wordAppend(String[] strings) {

        Map<String, Integer> map= new HashMap<String, Integer>();
        String result="";

        for(String word: strings)
        {
            if(map.containsKey(word))
            {
                map.put(word, map.get(word)+1);
                if(map.get(word)%2==0)
                {
                    result=result+word;
                }
            }
            else
            {
                map.put(word,1);
            }
        }

        return result;



    }
}
