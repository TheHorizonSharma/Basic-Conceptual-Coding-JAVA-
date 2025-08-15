package AssJava;
class Histo
{
    public static void main(String args[])
    {
        int hist[]={1, 2, 3, 4, 5, 8, 11};
        int size=hist.length;
        int max=hist[0];
        for (int i=1; i<size; i++) 
        {
            if (hist[i]>max) 
            {
                max=hist[i];
            }
        }
        for (int l=max; l>=1; l--) 
        {
            for (int i = 0; i<size; i++) 
            {
                if (hist[i]>=l) 
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }   
}