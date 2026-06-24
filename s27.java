import java.util.HashMap;

public class s27 {
    
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i : a) {
            if(hm.containsKey(i)) {
                hm.put(i,hm.get(i)+1);
            } else {
                hm.put(i,1);
            }
        }
        
        for(int i : b) {
            if(hm.containsKey(i)) {
                 int c = hm.get(i);
                 if(c==1) {
                     hm.remove(i);
                 } else {
                     
                 hm.put(i,c-1);
                 }
            } else {
                return false;
            }
        }
        return true;
    }
}

}
