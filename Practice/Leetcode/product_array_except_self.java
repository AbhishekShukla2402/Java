public class product_array_except_self {
    public int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];
        int k = 0;
        int product = 1;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            while (k < i) {
                product = product * nums[k];
                k += 1;
            }
            k = 0;

            if (i + 1 < nums.length) {
                j = i + 1;
                while (j < nums.length) {
                    product = product * nums[j];
                    j += 1;
                }
            }
            arr[i] = product;
            product = 1;

        }

        return arr;
    }
}
