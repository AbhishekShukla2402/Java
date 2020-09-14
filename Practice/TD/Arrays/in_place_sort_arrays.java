package Arrays;

public class in_place_sort_arrays {

    public static void main(String[] args)
    {
        int[] arr1={1,4,7,8,10};
        int[] arr2={2,3,9};

        int tmp=0;

        for(int i=0; i<arr1.length; i++) {
            if (arr1[i] > arr2[0]) {
                tmp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = tmp;


                int first = arr2[0];
                int k;
                System.out.println(first);

                for (k = 1; k < arr2.length && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];

                    System.out.println(arr2[k - 1] + " " + arr2[k]);
                }
                System.out.println(arr2[k - 1]);
                arr2[k - 1] = first;


            }
        }


        System.out.println();

        for(int i=0; i<arr1.length; i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }

}
