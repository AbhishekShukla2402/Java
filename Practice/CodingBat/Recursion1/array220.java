package Recursion1;

public class array220 {
    public boolean array220(int[] nums, int index) {

        if(index==nums.length)
        {
            return false;
        }

        if(nums.length==1 || nums.length==0)
        {
            return false;
        }

        if(index<nums.length-1 && nums[index+1]==10*nums[index])
        {
            return true;
        }

        return array220(nums, index+1);

    }
}
