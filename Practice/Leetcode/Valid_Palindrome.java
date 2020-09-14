public class Valid_Palindrome {

    public boolean isPalindrome(String str) {

        str=str.toLowerCase();
        String res="";

        String rev="";

        for(int i=0; i<str.length(); i++)
        {
            if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)))
            {
                res=res+str.charAt(i);
            }
        }

        for(int i=res.length()-1; i>=0; i--)
        {
            rev=rev+res.charAt(i);
        }

        if(rev.equals(res))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
