import java.util.Scanner;
import java.util.ArrayList;
public class take_player_names {
    static Scanner sc = new Scanner(System.in);
    public String[] enter_names()
    {
        //ArrayList<String>  list_of_names = new ArrayList<String>();
        String[] list_of_names = new String[2];
        System.out.println("Enter your names: ");
        list_of_names[0] = sc.nextLine();
        list_of_names[1] = sc.nextLine();

        return list_of_names;
    }

}
