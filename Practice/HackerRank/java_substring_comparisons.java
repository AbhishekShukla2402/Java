import java.util.Scanner;

public class java_substring_comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String tmp="";

        for(int i=0; i<s.length(); i++)
        {
            if(i+(k-1)<s.length())
            {
                tmp=s.substring(i,i+k);
                if(tmp.compareTo(largest)>=0)
                {
                    largest=tmp;
                }

                if(smallest.length()==0)
                {
                    smallest=tmp;
                }

                if(tmp.compareTo(smallest)<=0)
                {
                    smallest=tmp;
                }

            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}