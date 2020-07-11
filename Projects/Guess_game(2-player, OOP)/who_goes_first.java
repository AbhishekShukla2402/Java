import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class who_goes_first {
    static Scanner sc = new Scanner(System.in);
    public String[] decide(String[] names)
    {
        String player2;
        System.out.println("Computer will decide who goes first!");
        Random r = new Random();
        String player1 = names[r.nextInt(names.length)];
        if(player1.equals(names[0]))
        {
            player2 = names[1];
        }
        else {
            player2 = names[0];
        }

        //DELAY 2 SECONDS....
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }


        System.out.print("The computer has decided");
        for(int i =0; i<3;i++)
        {
            //DELAY 1 SECOND....
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
        }
        System.out.println();
        //DELAY 1 SECOND....
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }




        System.out.println(player1+" shall go first!");
        String[] players = {player1, player2};
        return players;









    }

}
