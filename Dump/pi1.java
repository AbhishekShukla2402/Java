public class pi1 {

    public static void main(String[] args) {
        double mypi = 4.0;
        double j = 3.0;
        double sum = 0;
        double ctr = 1;
        for (int i = 0; i < 8001; i++) {
            if (i % 2 == 0) {
                sum += 4 / ctr;
                System.out.println(sum);

            } else {
                sum -= 4 / ctr;
            }
            ctr += 2;

        }

        System.out.println("");
        System.out.println("Actual value of Pi is:"+Math.PI);
    }
}
