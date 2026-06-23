import java.util.SortedSet;
import java.util.TreeSet;

public class s24 {
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        SortedSet<Integer> set = new TreeSet<Integer>();
        for(int i:arr) {
            set.add(i);
        }
        int ans =0;
        int c = 1;
        int prev = -1;
        for(int i:set) {
            if(prev==-1) {
                prev = i;
                continue;
            }
            if(i==(prev+1)) c++;
            else c=1;
            
            ans = Math.max(ans,c);
            prev=i;
        }
        return ans;
    }

}
