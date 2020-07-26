public class isEverywhere {
    public boolean isEverywhere(int[] nums, int val) {

        boolean flag1 = true;
        boolean flag2 = true;

        for(int i=0; i<nums.length; i++)
        {
            if(i%2==0)
            {
                if(nums[i]!=val)
                {
                    flag1 = false;
                }
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            if(i%2!=0)
            {
                if(nums[i]!=val)
                {
                    flag2 = false;
                }
            }
        }

        if(!flag1 && !flag2)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
