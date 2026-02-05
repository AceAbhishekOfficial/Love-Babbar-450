import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class s18 {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        SortedSet<Integer> hs = new TreeSet<>();
        int c0 = 0;
        for (int i : arr) {
            hs.add(i);
            if (i == 0)
                c0++;
        }

        for (int a : hs) {
            if (a < 0 && hs.contains(-1 * a)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(a);
                list.add(a * -1);
                ans.add(list);

            }
        }
        if (c0 >= 2) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(0);
            ans.add(list);
        }
        return ans;
    }
}
