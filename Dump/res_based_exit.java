import java.util.Scanner;
//import java.lang.*;


public class res_based_exit {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String res ="Y";
        int i = 1;
        while(res.equalsIgnoreCase("y"))
        {
            System.out.println("Iteration "+i+"...");
            System.out.println("Continue? y/n");                     //res.equalsIgnoreCase("y")
            res = sc.nextLine();
            i+=1;
        }
        System.out.println("You chose to exit...");
    }

}
