public class SIX_revrot {

    static String rev(String num)
    {
        String rev="";

        for(int k=num.length()-1; k>=0; k--)
        {
            rev+=num.charAt(k);
        }
        return rev;
    }


    static boolean cube_check(String num)
    {
        int sum=0;
        for(int i=0; i<num.length(); i++)
        {
            sum+=Integer.parseInt(""+num.charAt(i)) + Integer.parseInt(""+num.charAt(i)) + Integer.parseInt(""+num.charAt(i));
        }

        if(sum%2==0)
        {
            return true;
        }

        return false;

    }








    static String rotate(String num) {
        char[] arr = num.toCharArray();
        char[] tmp = new char[arr.length];
        int index=0;
        String res="";


        for(int i=0; i<arr.length; i++)
        {
            index = i-1;
            if(index<0)
            {
                index=arr.length-1;
            }
            tmp[index]=arr[i];
        }

        for(int j=0; j<tmp.length; j++)
        {
            res=res+tmp[j];
        }

        return res;
    }




    public static void main(String[] args)
    {
        String num="123456987654";
        int sz=6;
        int i=0;
        String chunk="";
        String last_chunk="";
        String res="";
        while(i<num.length())
        {
            if(i+sz<=num.length()) {
                chunk = num.substring(i, i + sz);
                if(cube_check(chunk))
                {
                    res+=(rev(chunk));
                }
                else
                {
                    res+=rotate(chunk);
                }
            }
            else
            {
                last_chunk=num.substring(i,num.length());
                //res+=last_chunk;
                break;
            }
            i+=sz;
        }

        System.out.println(res);
    }
}
