import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class domino_piling {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int area = Integer.parseInt(arr[0])*Integer.parseInt(arr[1]);

        System.out.println((int)area/2);
    }

}
