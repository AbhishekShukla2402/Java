public class fizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String[] list = new String[end-start];
        for(int i=0; i<list.length; i++)
        {
            if(start%3==0 && start%5==0)
            {
                list[i] = "FizzBuzz";
            }
            else if(start%3==0)
            {
                list[i] = "Fizz";
            }
            else if(start%5==0)
            {
                list[i] = "Buzz";
            }
            else
            {
                list[i] = Integer.toString(start);
            }
            start=start+1;
        }

        return list;

    }
}
