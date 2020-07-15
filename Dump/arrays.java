import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("This program only prints squares...");
        System.out.println();
        System.out.println("Enter row and column length: ");
        int num1 = Integer.valueOf(sc.nextLine());




        mult_arr(num1,num1);
    }

    public static void mult_arr(int a, int b) {
        String[][] m_arr = new String[a][b];

        for (int i = 0; i < m_arr.length; i++) {
            for (int j = 0; j < m_arr.length; j++) {
                m_arr[i][j] = i + " " + j;
            }
        }

        int k =0;
        while(k<=(6*m_arr.length)){System.out.print("-"); k++;}
        System.out.println();

        for (int i = 0; i < m_arr.length; i++) {
            for (int j = 0; j < m_arr.length; j++) {
                System.out.print("| " + m_arr[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();

        }
        k =0;
        while(k<=(6*m_arr.length)){System.out.print("-"); k++;}
        System.out.println();
    }
}
