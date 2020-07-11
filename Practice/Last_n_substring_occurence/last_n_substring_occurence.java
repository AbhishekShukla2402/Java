import java.util.Scanner;
public class last_n_substring_occurence {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Enter the length of substring(end of string) to be counted: ");
        int n = sc.nextInt();
        String str1="ax";
        if(str.length()<n)
        {
            System.out.println("0");
            System.exit(0);
        }
        String sub = str.substring(str.length()-n,str.length());
        int len = sub.length();
        int len1=str.length()-len;
        int ctr=1;
        for(int i=0; i<str.length(); i++)
        {
            if(i<len1 && (str.substring(i,i+len)).equals(sub))
            {
                ctr=ctr+1;
            }
        }
        System.out.println(ctr-1);
    }
}
