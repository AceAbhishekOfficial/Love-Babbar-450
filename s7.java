// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int e = arr[arr.length-1];
        for(int a=arr.length-1;a>0;a--) {
            arr[a]=arr[a-1];
        }
        arr[0]=e;
    }
}