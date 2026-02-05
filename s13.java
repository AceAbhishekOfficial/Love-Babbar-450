public class s13 {
    int maxSubarraySum(int[] arr) {
        // Code here
       int max=arr[0];
       int sum=arr[0];
       
       for(int a=1;a<arr.length;a++) {
 
           if(sum<0) {
               sum = arr[a];
           } else
           sum+=arr[a];
           
           if(sum>max) {
               max=sum;
           }
           
       }

       return max;
    }
}
