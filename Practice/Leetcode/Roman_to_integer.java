import java.util.ArrayList;
import java.util.*;
public class Roman_to_integer {

    public static int value(char r)
    {
        if(r=='I')
            return 1;
        if(r=='V')
            return 5;
        if(r=='X')
            return 10;
        if(r=='L')
            return 50;
        if(r=='C')
            return 100;
        if(r=='D')
            return 500;
        if(r=='M')
            return 1000;
        return -1;
    }


    public static void main(String[] args) {
        String s = "MCMXCIV";
        //ArrayList<String> list = new ArrayList<String>(Arrays.asList(s.split("")));
        //System.out.println(list);
        int sum = 0;
        for(int i=0; i<s.length();i++)
        {
            if(s.length()==1)
            {
                sum+=value(s.charAt(0));
            }
            else if(i+1<s.length() && s.charAt(i)=='I' && s.charAt(i+1)=='V')
            {
                i+=1;
                sum+=4;
            }
            else if(i+1<s.length() && s.charAt(i)=='I' && s.charAt(i+1)=='X')
            {
                i+=1;
                sum+=9;
            }
            else if(i+1<s.length() && s.charAt(i)=='X' && s.charAt(i+1)=='L')
            {
                i+=1;
                sum+=40;
            }
            else if(i+1<s.length() && s.charAt(i)=='X' && s.charAt(i+1)=='C')
            {
                i+=1;
                sum+=90;
            }
            else if(i+1<s.length() && s.charAt(i)=='C' && s.charAt(i+1)=='D')
            {
                i+=1;
                sum+=400;
            }
            else if(i+1<s.length() && s.charAt(i)=='C' && s.charAt(i+1)=='M')
            {
                i+=1;
                sum+=900;
            }
            else
            {
                sum+=value(s.charAt(i));
            }

        }
        System.out.println(sum);



    }
}
