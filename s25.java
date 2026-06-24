import java.util.HashMap;
import java.util.Map;

public class s25 {

    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = arr.length;
        int limit = n/k;
        for(int i: arr) {
            if(hm.containsKey(i)) {
                int count = hm.get(i);
                count++;
                hm.put(i,count);
            } else {
                hm.put(i,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() > limit) ans++;
        }
        
        return ans;
    }

}
