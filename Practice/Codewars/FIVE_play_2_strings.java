import java.util.HashMap;

public class FIVE_play_2_strings {
    public static void main(String[] args)
    {
        String str1="abcdeFg";
        String str2="defgG";
        String tmp1="";
        String tmp2="";

        tmp1=str1.toLowerCase();
        tmp2=str2.toLowerCase();

        String res="";

        HashMap<Character, Integer> map1 =new HashMap<>();
        HashMap<Character, Integer> map2 =new HashMap<>();

        for(int i=0; i<tmp1.length(); i++)
        {
            if(map1.isEmpty())
            {
                map1.put(tmp1.charAt(i), 1);
            }
            else if(!map1.containsKey(tmp1.charAt(i)))
            {
                map1.put(tmp1.charAt(i), 1);
            }
            else
            {
                map1.put(tmp1.charAt(i), map1.get(tmp1.charAt(i))+1);
            }
        }

        for(int i=0; i<tmp2.length(); i++)
        {
            if(map2.isEmpty())
            {
                map2.put(tmp2.charAt(i), 1);
            }
            else if(!map2.containsKey(tmp2.charAt(i)))
            {
                map2.put(tmp2.charAt(i), 1);
            }
            else
            {
                map2.put(tmp2.charAt(i), map2.get(tmp2.charAt(i))+1);
            }
        }

        int bigger=0;
        if(str1.length()>str2.length())
        {
            bigger=str1.length();
        }
        else
        {
            bigger=str2.length();
        }


        int k=0;

        for(int i=0; i<bigger; i++)
        {
            if(k<str1.length() && map2.containsKey(tmp1.charAt(k)))
            {
                if(map2.get(tmp1.charAt(k))%2==0)
                {
                    res+=str1.charAt(k);
                    k+=1;
                }
                else
                {
                    if(Character.isLowerCase(str1.charAt(k))) {
                        res += Character.toUpperCase(str1.charAt(k));
                        k += 1;
                    }
                    else
                    {
                        res += Character.toLowerCase(str1.charAt(k));
                        k += 1;
                    }
                }
            }
            else if(k<str1.length() && !map2.containsKey(tmp1.charAt(k)))
            {
                res+=str1.charAt(k);
                k+=1;
            }
            else if(k>=str1.length())
            {
                break;
            }
        }


         k=0;

        for(int i=0; i<bigger; i++)
        {
            if(k<str2.length() && map1.containsKey(tmp2.charAt(k)))
            {
                if(map1.get(tmp2.charAt(k))%2==0)
                {
                    res+=str2.charAt(k);
                    k+=1;
                }
                else
                {
                    if(Character.isLowerCase(str2.charAt(k))) {
                        res += Character.toUpperCase(str2.charAt(k));
                        k += 1;
                    }
                    else
                    {
                        res += Character.toLowerCase(str2.charAt(k));
                        k += 1;
                    }
                }
            }
            else if(k<str2.length() && !map1.containsKey(tmp2.charAt(k)))
            {
                res+=str2.charAt(k);
                k+=1;
            }
            else if(k>=str2.length())
            {
                break;
            }
        }

        System.out.println(res);





    }

}
