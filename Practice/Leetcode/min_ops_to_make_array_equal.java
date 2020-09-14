public class min_ops_to_make_array_equal {

    static int e_solve(int[] arr)
    {
        int a_pointer = arr.length/2 -1;
        int b_pointer = arr.length/2;
        int ctr=0;

        while(a_pointer>=0 && b_pointer<=arr.length)
        {
            while(arr[a_pointer]!=arr[b_pointer])
            {
                arr[a_pointer]+=1;
                arr[b_pointer]-=1;
                ctr++;
            }
            a_pointer--;
            b_pointer++;
        }

        return ctr;
    }


    static int o_solve(int[] arr)
    {
        int a_pointer = arr.length/2-1;
        int b_pointer = arr.length/2+1;
        int med = arr[arr.length/2];
        int ctr=0;

        while(a_pointer>=0 && b_pointer<=arr.length-1)
        {
            while(arr[a_pointer]!=med && arr[b_pointer]!=med)
            {
                arr[a_pointer]+=1;
                arr[b_pointer]-=1;
                ctr++;

            }
            a_pointer--;
            b_pointer++;
        }

        return ctr;
    }




    public static void main(String[] args)
    {
        int[] arr={1,3,5};

        //assign pointers
        //if array odd, pointers will be +1 and -1 off array mid
        //else pointers will be arr_len/2 and arr_len/2 +1

        if(arr.length%2==0)
        {
            //call even solve
            System.out.println(e_solve(arr));
        }
        else
        {
            //call odd solve
            System.out.println(o_solve(arr));
        }
    }
}
