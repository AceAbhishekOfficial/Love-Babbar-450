import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

class s19{
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i:a) {
            hs1.add(i);
        }
        
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i:b) {
            if(hs1.contains(i)) {
                hs2.add(i);
            }
        }
        SortedSet<Integer> hs3 = new TreeSet<>();
        for(int i:c) {
            if(hs2.contains(i)) {
                hs3.add(i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(hs3);
        // Collections.sort(list);
        return list;
    }
}