import java.util.HashMap;

public class Valid_anagram {

    public boolean isAnagram(String str1, String str2) {

        if(str1.length()!=str2.length())
        {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<str1.length(); i++)
        {
            if(!map.containsKey(str1.charAt(i)))
            {
                map.put(str1.charAt(i),1);
            }
            else
            {
                map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
            }
        }

        for(int i=0; i<str2.length(); i++)
        {
            if(!map.containsKey(str2.charAt(i)))
            {
                return false;
            }
            else if(map.containsKey(str2.charAt(i)))
            {
                map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
            }

            if(map.get(str2.charAt(i))==0)
            {
                map.remove((Character)str2.charAt(i));
            }
        }

        if(!map.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
