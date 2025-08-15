package AssJava;

class NumberPyramid 
{
    public static void main(String[] args) 
    {
        int no, i, j, k, l;
        no=5;//(int)(Math.random()*10);
        System.out.println("Generated Number is:"+no);
        for (i=1; i<=no; i++) 
        {
            for (j=1; j<=no-i; j++) 
            {
                System.out.print(" ");
            }
            for (k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            for (l = i - 1;l>=1; l--) 
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}