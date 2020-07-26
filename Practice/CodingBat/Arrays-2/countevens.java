public class countevens {
    public int countEvens(int[] nums) {
        int ctr=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]%2==0)
            {
                ctr++;
            }
        }
        return ctr;
    }
}
