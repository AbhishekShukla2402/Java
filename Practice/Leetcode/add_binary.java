import java.util.HashMap;
import java.util.Scanner;

public class add_binary {

    public static void main(String[] args)
    {

        //String str1="11101";
        //String str2="00111";
        String str1="1010101";
        String str2="0010110";
        String result="";

        if(str2.length()>str1.length())
        {
            String tmp=str2;
            str2=str1;
            str1=tmp;
        }

        int i=str1.length()-1;
        int j=str2.length()-1;
        int carry=0;
        int sum=0;

        if(str1.length()!=str2.length()) {
            while (i >= 0) {
                if (j >= 0) {
                    int a = Integer.parseInt(String.valueOf(str1.charAt(i)));
                    int b = Integer.parseInt(String.valueOf(str2.charAt(j)));
                    sum = a + b + carry;
                    carry = 0;

                    if (sum == 0) {
                        result = String.valueOf(sum) + result;
                    } else if (sum == 1) {
                        result = String.valueOf(sum) + result;
                    } else if (sum == 2) {
                        result = "0" + result;
                        carry = 1;
                    } else if (sum == 3) {
                        result = "1" + result;
                        carry = 1;
                    }


                    sum = 0;
                } else {
                    int a = Integer.parseInt(String.valueOf(str1.charAt(i)));
                    sum += a + carry;
                    carry = 0;

                    if (sum == 0) {
                        result = "0" + result;
                    }

                    if (sum == 1) {
                        result = "1" + result;
                    }

                    if (sum == 2 && i > 0) {
                        result = "0" + result;
                        carry = 1;
                    }

                    if (sum == 3 && i > 0) {
                        result = "1" + result;
                        carry = 1;
                    }
                    if (sum == 2 && i == 0) {
                        result = "10" + result;

                    }
                    if (sum == 3 && i == 0) {
                        result = "11" + result;
                    }

                    sum = 0;

                }
                i -= 1;
                j -= 1;
            }
        }

        else
        {
            while(i>=0)
            {
                int a = Integer.parseInt(String.valueOf(str1.charAt(i)));
                int b = Integer.parseInt(String.valueOf(str2.charAt(j)));
                sum = a + b + carry;
                carry = 0;


                if (sum == 0) {
                    result = String.valueOf(sum) + result;
                } else if (sum == 1) {
                    result = String.valueOf(sum) + result;
                } else if (sum == 2 && i>0) {
                    result = "0" + result;
                    carry = 1;
                } else if (sum == 3 && i>0) {
                    result = "1" + result;
                    carry = 1;
                } else if (sum == 2 && i==0) {
                    result = "10" + result;
                    carry = 1;
                } else if (sum == 3 && i==0) {
                    result = "11" + result;
                    carry = 1;
                }

                sum = 0;
                i-=1;
                j-=1;


            }
        }

        System.out.println(result);





    }




}