import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

public class way_too_long_words {

    public static String solve(String str)
    {
        return ""+str.charAt(0)+str.substring(1,str.length()-1).length()+str.charAt(str.length()-1);
    }



    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ctr = Integer.parseInt(br.readLine());

        String word;

        for(int i=0; i<ctr; i++)
        {
            word = br.readLine();
            if(word.length()>10) {
                System.out.println(solve(word));
            }
            else
            {
                System.out.println(word);
            }
        }


    }


}
