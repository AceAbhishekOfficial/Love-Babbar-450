class Solution
{ 
    public static int findSum(int arr[],int N) 
    {
       int max =arr[0];
       int min = arr[0];
       for(int i:arr)
       {
           if(i>max) max=i;
           if(i<min) min=i;
       }
       return min+max;
    }
}
