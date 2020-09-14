import java.util.ArrayList;
import java.util.Arrays;

public class Reverse_words_in_string {
    public String reverseWords(String str) {
        String res="";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.trim().split(" ")));
        for(int i=list.size()-1; i>=0; i--)
        {
            if(!list.get(i).equals("")) {
                res = res + list.get(i) + " ";
            }
        }
        return res.trim();

    }
}
