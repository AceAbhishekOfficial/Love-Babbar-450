import java.util.Arrays;

class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length-1;
        int ans = arr[n]-arr[0];
        for(int i=0;i<arr.length-1;i++) {
            
            if(arr[i+1]-k<0)
                continue;
            
            int max = Math.max(arr[i]+k,arr[n]-k);
            int min = Math.min(arr[0]+k,arr[i+1]-k);
            ans =  Math.min(ans,max-min);
        }
        return ans;
    }
}