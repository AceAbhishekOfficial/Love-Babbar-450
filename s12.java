import java.util.Arrays;

class s12 {
    public void mergeArrays(int a[], int b[]) {
        // code here

        int j = 0;
        
        for(int i = 0;i<a.length;i++) {
            if(a[i] > b[j]) {
                swap(i,j,a,b);
            }
        }
        Arrays.sort(b);
    }
    
    public static void swap(int i, int j , int[] a, int[] b) {
        int first = b[j];
        int last = a[a.length-1];
        
        for(int x = a.length-1;x>i;x--) {
            a[x] = a[x-1];
        }
        for(int x = j;x<b.length-1;x++) {
            b[x] = b[x+1];
        }
        
        a[i] = first;

        b[b.length-1] = last;
        
    }
    

}