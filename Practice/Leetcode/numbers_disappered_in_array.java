import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class numbers_disappered_in_array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }

        List<Integer> list = new ArrayList<>();


        for(int i=1; i<=nums.length; i++)
        {
            if(!set.contains(i))
            {
                list.add(i);
            }
        }



        return list;

    }
}
