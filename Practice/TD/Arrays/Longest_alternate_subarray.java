package Arrays;

public class Longest_alternate_subarray {

    public static void main(String[] args)
    {
        int[] arr={8,-1,4,4,-1,9,-1,9,0};

        int sum=0;
        int max=0;

        for(int i=0; i<arr.length; i++)
        {
            if(i<arr.length-1 && arr[i]>=0)
            {
                if(arr[i+1]<0)
                {
                    sum+=arr[i];
                }
                else
                {
                    sum+=arr[i];
                    if(sum>max)
                    {
                        max=sum;
                    }
                    sum=0;
                }
            }
            else if(i<arr.length-1 && arr[i]<0)
            {
                if(arr[i+1]>0)
                {
                    sum+=arr[i];
                }
                else
                {
                    sum+=arr[i];
                    if(sum>max)
                    {
                        max=sum;
                    }
                    sum=0;
                }
            }
            else if(i==arr.length-1 && arr[i]>=0)
            {
                if(arr[i-1]<0)
                {
                    sum+=arr[i];
                    if(sum>max)
                    {
                        max=sum;
                    }
                }
                else
                {
                    break;
                }
            }

            else if(i==arr.length-1 && arr[i]<0)
            {
                if(arr[i-1]>=0)
                {
                    sum+=arr[i];
                    if(sum>max)
                    {
                        max=sum;
                    }
                }
                else
                {
                    break;
                }
            }
        }

        System.out.println(max);

    }
}
