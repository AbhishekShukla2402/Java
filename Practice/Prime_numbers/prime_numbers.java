import java.util.Scanner;

public class prime_numbers {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("This program will display all prime numbers from 1 to user defined end value.");
        System.out.println("Enter end value: ");
        int ctr=0;
        if(userInput.hasNextInt()){
            int endvalue = userInput.nextInt();
            for (int i=1; i<=endvalue; i++){
                for(int j =1; j<=i; j++){
                    if (i%j==0){
                        ctr+=1;

                    }
                }
                if (ctr<=2){
                    System.out.print(i + " ");
                }
                ctr=0;
            }
        }

    }

}
