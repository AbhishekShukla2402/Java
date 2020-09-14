public class SIX_bouncing_balls {
    public static void main(String[] args)
    {
        double h=2.0, bounce=0.5,window=1;

        if(h<=0 || (bounce<=0 || bounce>=1) || window>h)
        {
            System.out.println("FATAL ERROR: XF0000CFG9");
            System.exit(0);
        }

        int ctr=0;
        while(true)
        {
            ctr+=1;
            h=bounce*h;
            if(h>window) {
                ctr += 1;
            }
            else
                 break;
        }

        System.out.println(ctr);

    }
}
