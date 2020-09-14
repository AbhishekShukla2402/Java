public class merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //int m=3,n=3;

        //int[] nums1={1,2,3,0,0,0};
        //int[] nums2={2,5,6};
        int[] arr=new int[nums1.length];

        int[] tmp_nums1 = new int[m];
        int[] tmp_nums2 = new int[n];

        for(int i=0; i<m; i++)
        {
            tmp_nums1[i]=nums1[i];
        }

        for(int i=0; i<n; i++)
        {
            tmp_nums2[i]=nums2[i];
        }

        int j=0, k=0;

        for(int i=0; i<arr.length; i++)
        {
            if(j<tmp_nums1.length && k<tmp_nums2.length && tmp_nums1[j]<tmp_nums2[k])
            {
                arr[i]=tmp_nums1[j];
                j+=1;
            }

            else if(j<tmp_nums1.length && k<tmp_nums2.length && tmp_nums1[j]>tmp_nums2[k])
            {
                arr[i]=tmp_nums2[k];
                k+=1;
            }
            else if(j<tmp_nums1.length && k<tmp_nums2.length && tmp_nums1[j]==tmp_nums2[k])
            {
                arr[i]=tmp_nums1[j];
                j+=1;
                i+=1;
                arr[i]=tmp_nums2[k];
                k+=1;
            }

            else if(j<tmp_nums1.length && k==tmp_nums2.length)
            {
                arr[i]=tmp_nums1[j];
                j+=1;
            }
            else if(j==tmp_nums1.length && k<tmp_nums2.length)
            {
                arr[i]=tmp_nums2[k];
                k+=1;
            }
        }

        for(int i=0; i<nums1.length; i++)
        {
            nums1[i]=arr[i];
        }

    }
}
