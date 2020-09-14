public class SIX_Mexican_Wave {

    public static void main(String[] args)
    {
        String word=" gap ";
        String[] arr=new String[word.trim().length()];
        String tmp="";
        int ctr=0;

        for(int k=0; k<word.length();k++)
        {
            if(k==0)
            {
                tmp=tmp+Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length());
                if(!tmp.equals(word)) {
                    arr[ctr] = tmp;
                    ctr+=1;
                };
            }
            else
            {
                tmp=tmp+word.substring(0,k)+Character.toUpperCase(word.charAt(k))+word.substring(k+1, word.length());
                if(!tmp.equals(word)) {
                    arr[ctr] = tmp;
                    ctr+=1;
                }

            }
            tmp="";
        }


        for(String w: arr)
        {
            System.out.print(w+" ");
        }
    }

}
