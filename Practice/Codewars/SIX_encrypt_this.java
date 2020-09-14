public class SIX_encrypt_this {

    public static void main(String[] args)
    {
        String str="A wise old owl lived in an oak";

        //65 119esi 111dl 111lw 108dvei 105n 97n 111ka

        String[] arr = str.split(" ");
        String res="";
        String tmp="";



        for(String word: arr) {

            char[] char_array = word.toCharArray();
            if(char_array.length==1)
            {
                tmp+=Integer.toString((int)char_array[0]);
            }
            else if(char_array.length==2)
            {
                tmp+=Integer.toString((int)char_array[0])+char_array[1];
            }
            else
            {
                char ctmp=char_array[char_array.length-1];
                char_array[char_array.length-1] = char_array[1];
                char_array[1]=ctmp;

                for(int j=0; j<char_array.length; j++)
                {
                    if(j==0)
                    {
                        tmp+=Integer.toString((int)char_array[0]);
                    }
                    else
                    {
                        tmp+=char_array[j];
                    }
                }

            }

            res+=tmp+" ";
            tmp="";
        }

        System.out.println(res.trim());


    }


}
