class Solution
{
    public static void sort012(int arr[], int n)
    {
        int i=0;
        for(int a=0;a<2;a++)
        {
            for(int x=0;x<arr.length;x++)
            if(arr[x]==a)
            {
                int temp=arr[x];
                arr[x]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
    }
}