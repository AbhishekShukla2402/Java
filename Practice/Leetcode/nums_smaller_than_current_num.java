public class nums_smaller_than_current_num {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int ctr;
        int k=0;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            ctr=0;
            int j=0;
            while(j<nums.length)
            {
                if(nums[j]<nums[i])
                {
                    ctr+=1;
                }
                j+=1;
            }
            arr[k]=ctr;
            k++;
        }
        return arr;
    }
}
