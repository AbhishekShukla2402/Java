public class more14 {
    public boolean more14(int[] nums) {
        int ctr1=0, ctr4=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                ctr1++;
            }
            if(nums[i]==4)
            {
                ctr4++;
            }
        }
        if(ctr1>ctr4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
