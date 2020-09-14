import java.util.ArrayList;

public class Non_decreasing_array {
    public boolean checkPossibility(int[] arr) {

        int ctr = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        while (ctr <= 1) {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1) > list.get(i)) {
                    if (i - 2 >= 0 && list.get(i - 2) > list.get(i)) {
                        list.remove(i);
                        break;
                    } else {
                        list.remove(i - 1);
                        break;
                    }

                    //list.remove(i-1);
                    //break;
                }
            }
            ctr++;
        }
        if (arr.length - list.size() > 1) {
            return false;
        } else {
            return true;
        }

    }
}
