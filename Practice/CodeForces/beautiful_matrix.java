import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class beautiful_matrix {

    static int get_position(String[] arr)
    {
        int[] pos = new int[2];
        for(int j=0; j<arr.length; j++)
        {
            if(Integer.parseInt(arr[j])==1)
            {
                return j;
            }
        }

        return -1;
    }



    public static void main(String[] args) throws IOException
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int ctr=5;
        int column=-1;
        int row=-1;

        for(int i=0; i<ctr; i++)
        {
            String[] arr = br.readLine().split(" ");
            int pos = get_position(arr);
            if(pos!=-1)
            {
                column=pos;
                row=i;
                break;
            }
        }

        System.out.println((Math.abs(column-2)+Math.abs(row-2)));
    }

}
