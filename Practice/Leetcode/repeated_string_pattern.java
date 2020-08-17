public class repeated_string_pattern {
    public static void main(String[] args)
    {

            String str="abcabcabcabc";
            int repeats=0;
            int flag=0;
            String biggest_sub="";

            for(int i=str.length()/2; i>=1; i--)
            {
                String substring = str.substring(0,i);
                if(str.length() % substring.length()==0)
                {
                    repeats = str.length()/substring.length();
                }
                String result="";
                for(int j=0; j<repeats; j++)
                {
                    result=result+substring;
                }
                if(result.equals(str))
                {
                    flag=1;
                    if(substring.length()>biggest_sub.length())
                    {
                        biggest_sub=substring;
                    }
                }

            }
            if(flag==0) {
                System.out.println("False");
            }
            else
            {
                System.out.println(biggest_sub);
            }
        }
    }

