class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        for(int a=0;a<n/2;a++) {
            int temp = arr[a];
            arr[a] = arr[n-a-1];
            arr[n-a-1] = temp;
        }
    }
}