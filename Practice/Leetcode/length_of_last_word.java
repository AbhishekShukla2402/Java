import java.util.ArrayList;
import java.util.Arrays;

public class length_of_last_word {

        public int lengthOfLastWord(String s) {
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(s.split(" ")));
            if(list.size()==0)
            {
                return 0;
            }
            if(list.get(list.size()-1)==" ")
            {
                return 0;
            }
            return list.get(list.size()-1).length();

        }
    
}
