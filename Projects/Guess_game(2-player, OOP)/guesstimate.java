public class guesstimate {
    public String phrase(int random_number, int guess)
    {
        if((random_number-guess>10))
        {
            return "Too low!! Guess again!";
        }
        else if ((random_number-guess)<=10 && (random_number-guess)>3 )
        {
            return "Low! Guess again!";
        }
        else if ((random_number-guess)<=3 && (random_number-guess)>0)
        {
            return "Close!!";
        }

        if((random_number - guess < -10))
        {
            return "Too high!! Guess again!";
        }
        else if ((random_number-guess)>=-10 && (random_number-guess)<-3 )
        {
            return "High! Guess again!";
        }
        else
        {
            return "Close!!";
        }

    }
}
