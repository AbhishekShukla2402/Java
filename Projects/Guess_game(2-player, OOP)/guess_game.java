import java.util.Random;
import java.util.Scanner;

public class guess_game {
    static Scanner sc = new Scanner(System.in);
    public void start_game(String[] names)
    {
        guesstimate ge = new guesstimate();
        String player1 = names[0];
        String player2 = names[1];
        int guess;
        int k;
        int p1=0;
        int p2=0;

        Random r = new Random();
        int random_number = (int)(Math.random()*30);
        int round_number = 1;
        System.out.println("Computer will now choose a number between 1 to 30! Your job is to guess it!!");
        while(true)
        {
            k=0;
            while(k<=20){System.out.print("-"); k++;}
            System.out.print("Round "+round_number);
            k=0;
            while(k<=20){System.out.print("-"); k++;}

            System.out.println();
            System.out.println(player1 + ", take a guess...");


            // Check if player 1 entered a proper input
            while(true)
            {
                if(sc.hasNextInt())
                {
                    break;
                }
                else
                {
                    System.out.print("Enter a valid guess!!!");
                }
            }



            // Check player1 guess
            guess = sc.nextInt();
            if(guess == random_number)
            {
                System.out.println("Correct!");
                p1=1;
                break;
            }
            else
            {
                System.out.println(ge.phrase(random_number,guess));
            }

            System.out.println();
            System.out.println(player2 + ", take a guess...");


            // Check if player 1 entered a proper input
            while(true)
            {
                if(sc.hasNextInt())
                {
                    break;
                }
                else
                {
                    System.out.print("Enter a valid guess!!!");
                }
            }



            // Check player2 guess
            guess = sc.nextInt();
            if(guess == random_number)
            {
                System.out.println("Correct!");
                p2=1;
                break;
            }
            else
            {
                System.out.println(ge.phrase(random_number,guess));
            }

            round_number=round_number+1;
            System.out.println();

        }

        if(p1>0)
        {
            System.out.println("Congratulations "+player1+"! You've won the game!!");
        }
        else
        {
            System.out.println("Congratulations "+player2+"! You've won the game!!");
        }




    }
}
