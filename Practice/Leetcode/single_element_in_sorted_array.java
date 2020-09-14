import java.util.ArrayList;

public class single_element_in_sorted_array {
    public int singleNonDuplicate(int[] nums) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++)
        {
            if(!list.contains(nums[i]))
            {
                list.add(nums[i]);
            }
            else
            {
                list.remove((Integer) nums[i]);
            }
        }

        return list.get(0);

    }
}
