public class centeredAverage {
    public int centeredAverage(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int sum=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
        }

        sum=sum-(min+max);
        int avg = (int)(sum/(nums.length-2));
        return avg;

    }
}
