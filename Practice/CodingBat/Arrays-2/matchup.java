public class matchup {
    public int matchUp(int[] nums1, int[] nums2) {
        int diff=0;
        int ctr=0;
        for(int i=0; i<nums1.length; i++)
        {
            diff = nums1[i]-nums2[i];
            if(Math.abs(diff)<=2 && Math.abs(diff)>0)
            {
                ctr++;
            }
            diff=0;
        }
        return ctr;
    }
}
