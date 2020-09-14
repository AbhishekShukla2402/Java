public class Valid_Mountain_Array {
    public boolean validMountainArray(int[] A) {

        if(A.length<3)
        {
            return false;
        }

        int ctr=0;
        int k=0;
        for(int i=0; i<A.length; i++)
        {
            if(i==0 && A[i]>A[i+1])
            {
                return false;
            }

            if(i+1<=A.length-1 && A[i+1]==A[i])
            {
                return false;
            }

            if(i+1<=A.length-1 && A[i+1]<A[i])
            {
                k=i;
                break;
            }

            if(i==A.length-1)
            {
                return false;
            }
        }

        for(int j=k; j<A.length; j++)
        {
            if(j+1<=A.length-1 && A[j]<=A[j+1])
            {
                return false;
            }
        }

        return true;

    }
}
