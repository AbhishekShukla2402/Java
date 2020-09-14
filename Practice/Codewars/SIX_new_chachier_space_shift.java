import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SIX_new_chachier_space_shift {

    public static void main(String[] args)
    {
        String str="milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza";

        HashMap<String,Integer> set = new HashMap();

        set.put("milkshake",7);
        set.put("pizza", 4);
        set.put("onionrings", 6);
        set.put("coke", 8);
        set.put("sandwich", 5);
        set.put("chicken", 3);
        set.put("fries", 2);
        set.put("burger", 1);

        int a_pointer=0, b_pointer=0;
        String res="";
        String tmp="";


        ArrayList<String> list = new ArrayList<>();

        while(b_pointer<=str.length())
        {
            if(set.containsKey(str.substring(a_pointer,b_pointer)))
            {
                list.add(str.substring(a_pointer,b_pointer));
                a_pointer=b_pointer;
            }
            else
            {
                b_pointer+=1;
            }
        }


        for(int i=1; i<=set.size(); i++)
        {
            for(int j=0; j<list.size(); j++)
            {
                if(set.get(list.get(j))==i)
                {
                    tmp=list.get(j);
                    res+= tmp.substring(0, 1).toUpperCase() + tmp.substring(1)+" ";
                }
            }
        }

        System.out.println(res.trim());


    }


}
