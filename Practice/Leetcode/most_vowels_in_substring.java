import java.util.HashMap;

public class most_vowels_in_substring {
    public static void main(String[] args)
    {

        //s = "abciiidef", k = 3

        String str="aeiou";
        int k=2;

        String tmp="";
        int ctr=0;
        int max=0;
        int inner_ctr=0;
        int vowel_count=0;

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);

        for(int i=0; i<str.length(); i++)
        {
            while(ctr<k)
            {
                if(i+k<=str.length())
                {
                    tmp=str.substring(i,i+k);
                    while(inner_ctr<tmp.length())
                    {
                        if(map.containsKey(tmp.charAt(inner_ctr)))
                        {
                            vowel_count++;
                        }
                        inner_ctr+=1;
                    }
                }
                else
                {
                    break;
                }
                ctr++;
            }

            if(vowel_count>max)
            {
                max=vowel_count;
            }

            vowel_count=0;
            ctr=0;
            inner_ctr=0;
            tmp="";
        }

        System.out.println(max);


    }
}
