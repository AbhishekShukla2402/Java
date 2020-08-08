public class sameEnds {
    public static void main(String[] args) {
        String str = "Hello Hello";
        int len = str.length();
        String tmp = "";
        String result = "";

        for (int i = 0; i<len; i++)
        {
            tmp = tmp+str.charAt(i);
            int tmp_len = tmp.length();
            if(i<len/2 && str.substring(len-tmp_len, len).equals(tmp))
            {
                result = tmp;
            }
        }
        System.out.println(result);
    }
}