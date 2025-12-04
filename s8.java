class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max = arr[0];
        int sum = arr[0];
        for(int a=1;a<arr.length;a++) {
            sum+=arr[a];
            if(arr[a]>sum) {
                sum = arr[a];
            }
            if(sum > max) {
                max = sum;
            }

            
        }
        return max;
    }
}
