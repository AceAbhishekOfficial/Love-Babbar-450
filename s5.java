public class Solution {
    public static int[] separateNegativeAndPositive(int arr[]) {
        int i = 0;
        for(int a=0;a<arr.length;a++) {
            i = a;
            if(arr[a]>0)
                break;
        }
        
        for(int a = i;a<arr.length;a++) {
            if(arr[a]<0) {
                int temp = arr[a];
                arr[a] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        
        return arr;
    }
}