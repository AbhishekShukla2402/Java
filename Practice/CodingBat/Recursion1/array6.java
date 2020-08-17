package Recursion1;

public class array6 {
    public boolean array6(int[] nums, int index) {

        if(nums.length==0)
        {
            return false;
        }

        if(nums[index]==6)
        {
            return true;
        }
        if(index==nums.length-1 && nums[index]!=6)
        {
            return false;
        }


        return array6(nums, index+1);
    }

}
