public class sumNumbers {
    public int sumNumbers(String str) {
        int sum=0;
        String num1="";

        for(int i=0; i<str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                num1=num1+str.substring(i, i+1);
            }
            else
            {
                if(num1.length()>0) {
                    sum += Integer.parseInt(num1);
                    num1 = "";
                }
            }

        }
        if(num1.length()>0)
        {
            sum += Integer.parseInt(num1);
        }
        return sum;

    }

}
