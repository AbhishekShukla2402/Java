public class Add_Strings {

        public String addStrings(String str1, String str2) {

            String tmp="";
            if(str1.length()<str2.length())
            {
                tmp=str1;
                str1=str2;
                str2=tmp;
            }

            int k= str1.length()-1;
            int j=str2.length()-1;
            int sum=0;
            int b=0;
            int carry=0;
            String res="";
            while(k>=0)
            {
                int a = Integer.parseInt("" + str1.charAt(k));
                if(j>=0) {
                    b = Integer.parseInt("" + str2.charAt(j));
                }
                else
                {
                    b=0;
                }

                sum=a+b+carry;
                if(sum>9 && k>0)
                {
                    sum=sum%10;
                    carry=1;
                }
                else if(sum>9 && k==0)
                {
                    res=Integer.toString(sum)+res;
                    break;
                }
                else
                {
                    carry=0;
                }
                res=Integer.toString(sum)+res;

                k=k-1;
                j=j-1;

            }
            return res;

        }
}
