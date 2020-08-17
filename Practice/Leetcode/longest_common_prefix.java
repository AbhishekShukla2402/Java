public class longest_common_prefix {




    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "fhght"};
        if(strs.length==0)
        {
            System.out.println("");
            System.exit(0);
        }

        String prefix = strs[0];
        for(int i=1; i<strs.length; i++)
        {

            while(strs[i].indexOf(prefix)!=0)
            {
                prefix = prefix.substring(0, prefix.length()-1);
                //System.out.println(prefix);
            }

        }
        System.out.println(prefix);
    }

}
