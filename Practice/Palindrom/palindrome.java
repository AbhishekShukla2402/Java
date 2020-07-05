import java.util.Scanner;
import java.lang.*;
import java.io.*;


public class palindrome {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter a number: ");

        if (userInput.hasNextInt()){
            int numberEntered = userInput.nextInt();
            String str1 = Integer.toString(numberEntered);
            StringBuilder input = new StringBuilder();
            input.append(str1);
            input = input.reverse();

            if ((input.toString()).equals(str1)){
                System.out.println("Palindrome number");

            }
            else{
                System.out.println("Not palindrome");
            }


        }
        else{
            System.out.println("Enter a number next time retard...");
        }
    }
}
