public class either24 {
    public boolean either24(int[] nums) {
        boolean flag1=false;
        boolean flag2=false;
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]==2 && nums[i+1]==2)
            {
                flag1=true;
            }

            if(nums[i]==4 && nums[i+1]==4)
            {
                flag2=true;
            }
        }

        if(flag1 && flag2)
        {
            return false;
        }
        else if(flag1==false && flag2==false)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
