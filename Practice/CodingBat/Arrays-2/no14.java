public class no14 {
    public boolean no14(int[] nums) {
        boolean flag1=false;
        boolean flag2=false;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==1)
            {
                flag1=true;
            }
            if(nums[i]==4)
            {
                flag2=true;
            }
        }
        if(flag1==true && flag2==true)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
