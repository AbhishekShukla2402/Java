public class les3 {

    public static void main(String[] args){
        int randomNumber = (int) (Math.random()*50);
        if (randomNumber < 25){
            System.out.println("Random number is less than 25");
        }
        else if(randomNumber > 40){
            System.out.println("Random number is greater than 40");
        }
        else{
            System.out.println("Random number is between 25 and 40");
        }
        System.out.println("The random number is "+randomNumber);
    }
}
