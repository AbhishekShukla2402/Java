import java.util.HashSet;

public class Longest_non_repeat_substring {

    public static void main(String[] args)
    {
        String str="ab";

        int a_pointer=0;
        int b_pointer=0, max=0;

        HashSet<Character> set = new HashSet<Character>();
        while(b_pointer<str.length())
        {
            if(!set.contains(str.charAt(b_pointer)))
            {
                set.add(str.charAt(b_pointer));
                b_pointer+=1;
                if(set.size()>max)
                {
                    max=set.size();
                }


            }
            else
            {
                set.remove(str.charAt(a_pointer));
                a_pointer+=1;
            }
        }

        System.out.println(max);


    }
}
