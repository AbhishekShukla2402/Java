import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class find_common_characters {

    public static void main(String[] args)
    {
        String[] A = {"bella","label","roller"};

        List<String> list = new ArrayList<String>();

        int[] min_freq = new int[26];
        Arrays.fill(min_freq, Integer.MAX_VALUE);

        for(String word: A)
        {
            int char_freq[] = new int[26];
            for(char c: word.toCharArray())
            {
                char_freq[c-'a']++;
            }

            for(int i=0; i<min_freq.length;i++)
            {
                min_freq[i]=Math.min(min_freq[i], char_freq[i]);
            }
        }

        for(int i=0; i<min_freq.length; i++)
        {
            while(min_freq[i]>0)
            {
                list.add(""+(char)(i+'a'));
                min_freq[i]--;
            }
        }

        System.out.println(list);







    }

}
