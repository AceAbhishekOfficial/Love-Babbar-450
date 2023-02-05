class Compute 
{  
    public void rotate(int arr[], int n)
    {
        int last = arr[n-1];
        for(int a=0;a<n;a++)
        {
            int temp = last;
            last = arr[a];
            arr[a] = temp;
        }
    }
}