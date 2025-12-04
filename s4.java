class Solution {
    public void sort012(int[] arr) {
        // code here
        int i = 0;
        for(int a=0;a<arr.length;a++) {
            i = a;
            if(arr[a]!=0)
                break;
        }
        
        for(int a = i;a<arr.length;a++) {
            if(arr[a]==0) {
                arr[a] = arr[i];
                arr[i] = 0;
                i++;
            }
        }
        
        for(int a = i;a<arr.length;a++) {
            if(arr[a]==1) {
                arr[a] = arr[i];
                arr[i] = 1;
                i++;
            }
        }
        
        
        
    }
}