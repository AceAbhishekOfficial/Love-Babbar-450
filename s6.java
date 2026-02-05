import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> hs = new HashSet<>();
        for(int i:a) {
            hs.add(i);
        }
        for(int i:b) {
            hs.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>(hs);
        return list;
    }
}