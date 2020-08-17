public class search_insert_position {
    public int bsearch(int[] arr, int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;


            if (arr[m] == x)
                return m;


            if (arr[m] < x)
                l = m + 1;


            else
                r = m - 1;
        }

        return -1;
    }



    public int searchInsert(int[] nums, int target)
    {


        int res = bsearch(nums, target);
        if(res==-1)
        {
            if(target < nums[0])
            {
                return 0;
            }
            else if(target > nums[nums.length-1])
            {
                return nums.length;
            }
            else
            {
                for(int i=0; i<nums.length; i++)
                {
                    if(target>nums[i] && target<nums[i+1])
                    {
                        return i+1;
                    }
                }
            }
        }
        return res;



    }
}
