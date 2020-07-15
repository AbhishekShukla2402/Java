import java.util.Scanner;

public class misc1
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] arg){
        System.out.println("Your fav number: ");

        if (userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();

            System.out.println("Number entered: " + numberEntered);
            int absnum = Math.abs(numberEntered);
            int bigger = Math.max(numberEntered,7);
            int smaller = Math.min(numberEntered, 12);
            double sq = Math.sqrt(numberEntered);
            System.out.println("Square root of number:  " + sq);
        }
        else
        {
            System.out.println("Retard");
        }

        //System.out.println("Number entered: " + numberEntered);
    }
}