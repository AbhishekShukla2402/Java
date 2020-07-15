public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double a, double b)
    {
        //a = Math.abs(a);
        //b = Math.abs(b);
        //DecimalFormat numberformat = new DecimalFormat("#.000");
        //a = Double.valueOf(numberformat.format(a));
        //b = Double.valueOf(numberformat.format(b));
        if((int)(a*1000) == (int)(b*1000))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}