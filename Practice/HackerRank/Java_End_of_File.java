import java.io.*;
import java.util.*;

public class Java_End_of_File {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int line_number=1;
        while(sc.hasNext())
        {
            System.out.println(line_number + " " + sc.nextLine());
            line_number+=1;
        }

    }
}
