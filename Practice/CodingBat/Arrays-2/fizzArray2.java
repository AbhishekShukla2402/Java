public class fizzArray2 {
    public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.toString(i);
        }
        return arr;
    }
}
