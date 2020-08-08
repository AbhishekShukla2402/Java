public class maxBlock {

    public int maxBlock(String str) {

        String tmp="";
        int len=0, max=0;

        for(int i=0; i<str.length(); i++)
        {
            if(i+1<=str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                len=len+1;
            }
            else
            {
                len=len+1;
                if(len>max)
                {
                    max=len;
                }
                len=0;
            }
        }
        return max;
    }

}
