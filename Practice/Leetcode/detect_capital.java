public class detect_capital {

    public boolean detectCapitalUse(String str) {
        int ctr=0;

        for(int i=0; i<str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                ctr+=1;
            }
        }

        if((ctr==1 && Character.isUpperCase(str.charAt(0))) || ctr==str.length() || ctr==0)
        {
            return true;
        }

        return false;
    }
}
