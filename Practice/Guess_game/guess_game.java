import java.util.Scanner;


public class guess_game {

    static Scanner sc = new Scanner(System.in);

    public static int random_number(){
        return (int)(Math.random()*10);
    }


    public static int check_guess(int guess, int random_number){
        if (guess > random_number){
            return 1;
        }
        else if (guess < random_number){
            return -1;
        }
        else{
            return 0;
        }
    }


    public static void main(String[] args){
        int random_number = random_number();
        int ctr=0;
        while (true){
            ctr+=1;
            System.out.println("Guess number "+ctr);
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();

            int tmp = check_guess(guess, random_number);
            if (tmp==1){
                System.out.println("Too high! Guess again!");
            }

            else if (tmp==-1){
                System.out.println("Too low! Guess again!");
            }

            else{
                System.out.println("Correct!");
                System.out.println("You took "+ctr+" tries to make the correct guess!");
                if(ctr==1){
                    System.out.println("Amazing! You must be some sort of a psychic!");
                }
                else if (ctr==2){
                    System.out.println("Excellent job! You're a natural!");
                }
                else if (ctr>2 && ctr<5){
                    System.out.println("Great job!");
                }
                else{
                    System.out.println("You can do much better! Try again!");
                }
                break;
            }


        }

    }



}
