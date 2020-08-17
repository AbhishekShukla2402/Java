import java.util.*;
public class PlusOne {

        public static void main(String[] args)
        {
            int[] digits={5,6,7,9};
            boolean flag=true;
            int ctr_1=0;

            //Handling cases where array is only 9s


            for(int k: digits)
            {
                if(k!=9)
                {
                    flag=false;
                    break;
                }
                ctr_1++;
            }

            if(flag==true)
            {
                int[] arr = new int[ctr_1+1];
                arr[0]=1;
                for(int i=1; i<ctr_1;i++)
                {
                    arr[i]=0;
                }
                //return arr;
                for(int i=0; i<arr.length;i++)
                {
                    System.out.println(arr[i]);
                }
                System.exit(0);
            }

            int[] num_array = new int[5000];
            int index = digits.length-1;
            int ctr=0;
            while(digits[index]==9 && index!=0)
            {
                digits[index]=0;
                index=index-1;
            }
            digits[index]+=1;


            for(int i=0; i<digits.length;i++)
            {
                System.out.println(digits[i]);
            }

        }

    }

