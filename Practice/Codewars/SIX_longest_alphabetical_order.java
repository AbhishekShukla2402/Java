public class SIX_longest_alphabetical_order {

    public static void main(String[] args)
    {
        String str="abcdeapbcdef";
        String res="";
        String max_res="";



        for(int i=0; i<str.length(); i++)
        {
            if(i+1<=str.length()-1 && (int)(str.charAt(i+1)-str.charAt(i))>=0)
            {
                if(res.length()==0)
                {
                    res+=str.charAt(i);
                    res+=str.charAt(i+1);
                }
                else
                {
                    res+=str.charAt(i+1);
                }
            }
            else
            {
                if(res.length()>max_res.length())
                {
                    max_res=res;
                }
                res="";
            }
        }

        System.out.println(max_res);
    }



}
