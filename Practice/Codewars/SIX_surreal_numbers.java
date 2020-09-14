
//COULDN'T PASS ALL THE EDGE CASES :(


public class SIX_surreal_numbers {

    static double[] FIX_IT(String[] arr)
    {
        double[] return_arr = new double[arr.length];
        int k=0;
        for(String element: arr)
        {
            if(element.contains("/"))
            {
                String[] tmp_array = element.split("/");
                double a = Integer.parseInt(tmp_array[0]);
                double b = Integer.parseInt(tmp_array[1]);
                double q = a/b;
                return_arr[k]=q;
                k+=1;
            }
            else
            {
                return_arr[k]=Integer.parseInt(element);
                k+=1;
            }
        }
        return return_arr;
    }


    public static void main(String[] args)
    {
        String str1="18 33 -2 19 -1/8";
        String str2="99 34 200/3";

        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");


        double[] num_arr1 = FIX_IT(arr1);
        double[] num_arr2 = FIX_IT(arr2);

        double max_element=Integer.MIN_VALUE;

        for(int i=0; i<num_arr1.length; i++)
        {
            if(num_arr1[i]>max_element)
            {
                max_element=num_arr1[i];
            }
        }

        for(int j=0; j<num_arr2.length; j++)
        {
            if(num_arr2[j]<max_element)
            {
                System.out.println("False");
                System.exit(0);
            }
        }
        System.out.println("True");
    }


}
