public class equalIsNot {
    public boolean equalIsNot(String str) {
        int ctr1=0,ctr2=0;
        for(int i=0; i<str.length(); i++)
        {
            if(i+2<=str.length() && str.substring(i,i+2).equals("is"))
            {
                ctr1+=1;
            }
            if(i+3<=str.length()&& str.substring(i,i+3).equals("not"))
            {
                ctr2+=1;
            }
        }

        if(ctr1==ctr2)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
