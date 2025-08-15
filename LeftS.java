package AssignJava;
class LeftS 
{
    public static void main(String args[])
    {
        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int n=2; 
        int size=arr.length;
        for (int i=0; i<n; i++)
        {
            int f=arr[0]; 
            for (int j=0; j<size-1; j++) 
            {
                arr[j]=arr[j+1];
            }
            arr[size-1]=f; 
        }
        for (int i=0; i<size; i++) 
        {
            System.out.print(arr[i]+" ");
        }
    }
}
