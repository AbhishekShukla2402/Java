import java.lang.*;
public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if (kilometersPerHour < 0){
            return -1;
        }
        else{
            long MilesPerHour = Math.round(0.62*kilometersPerHour);
            return MilesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour)
    {
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
            //System.exit();
        }
        else{
            int MilesPerHour = (int) Math.round(0.62*(Math.round(kilometersPerHour)));
            System.out.println(kilometersPerHour+" km/h = "+MilesPerHour+" mi/h");
        }
    }
}
