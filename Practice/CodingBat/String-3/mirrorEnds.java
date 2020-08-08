public class mirrorEnds {

    public String mirrorEnds(String str) {

        String result="";
        int len=str.length()-1;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==str.charAt(len))
            {
                result = result+str.charAt(i);
                len=len-1;
            }
            else
            {
                break;
            }
        }
        return result;

    }

}
