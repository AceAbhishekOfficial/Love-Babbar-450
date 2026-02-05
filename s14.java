import java.util.Arrays;
import java.util.LinkedList;

public class s14 {
   
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if(a[0]!=b[0]) {
                return Integer.compare(a[0],b[0]);
            } else {
                return Integer.compare(a[1],b[1]);
            }
        });
        LinkedList<int[]> list = new LinkedList<>();
        int arr[] = intervals[0];
        for(int a=0;a<intervals.length;a++) {
            int[] temp = intervals[a];
            if(temp[0]<=arr[1]) {
                arr[1] = Math.max(arr[1],temp[1]);
            } else {
                list.add(arr);
                arr = temp;
            }
            if(a==intervals.length-1) {
                list.add(arr);
            }
        }

        int[][] ans = new int[list.size()][2];
        int a = 0;
        for(int[] temp:list) {
            ans[a] = temp;
            a++;
        }
        return ans;
    }

}
