public class rotate_array {
    public void rotate(int[] nums, int k) {
        int index=0;
        int[] tmp = new int[nums.length];


        for(int i=0; i<nums.length; i++)
        {
            tmp[i]=nums[i];
        }


        for(int i=0; i<nums.length; i++)
        {
            index = i+k;
            if(index>nums.length-1)
            {
                while(index>nums.length-1)
                {
                    index=index-nums.length;
                }
            }
            nums[index]=tmp[i];
        }

    }
}
