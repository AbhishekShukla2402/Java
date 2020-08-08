public class notReplace {

    public String notReplace(String str) {

        if(str.length()==2 && str.equals("is"))
        {
            String res = "is not";
            return res;
        }

        String result="";
        for(int i=0; i<str.length(); i++)
        {
            if(i==0 && str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i+2)))
            {
                result=result+"is not";
                i+=1;
            }
            else if(i+1==str.length()-1 && str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1)))
            {
                result=result+"is not";
                break;
            }
            else if(i>0 && i+2<str.length()-1 && str.substring(i,i+2).equals("is") && !Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2)))
            {
                result=result+"is not";
                i+=1;
            }
            else
            {
                result=result+str.charAt(i);
            }
        }
        return result;

    }

}
