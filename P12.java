class Solution
{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n)
    {
        long sum=arr[0];
        long max=arr[0];
        for(int a=1;a<n;a++)
        {
            if(sum<0)
            {
                sum=arr[a];
            }
            else sum+=arr[a];
            if(sum>max) max =sum;
            
        }
        return max;
       
        }
    
}
