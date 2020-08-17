package Map1;

import java.util.Map;

public class mapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        String result="";
        if(map.containsKey("a") && map.containsKey("b"))
        {
            result=result+map.get("a")+map.get("b");
            map.put("ab", result);
        }
        return map;
    }
}
