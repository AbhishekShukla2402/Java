package Recursion1;

import java.util.ArrayList;

public class test {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1,1};
        int flag=0;
        ArrayList<Integer> stack = new ArrayList<Integer>();
        for(int i=arr.length-1; i>=0; i--) {
            if (stack.isEmpty()) {
                stack.add(arr[i]);
            } else {

                for (int j = 0; j < stack.size(); j++) {
                    if (arr[i] <= stack.get(j)) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    stack.add(arr[i]);
                }
                flag = 0;

            }
        }
        System.out.println(stack);



    }
}
