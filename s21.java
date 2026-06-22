import java.util.HashSet;

public class s21 {

    // Function to check whether there is a subarray present with 0-sum or not.

    // Time taken: 38m 47s
    static boolean findsum(int arr[]) {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        int i = 0;
        for (int num : arr) {
            sum += num;
            if (hs.contains(sum) || sum == 0)
                return true;
            else
                hs.add(sum);
        }
        return false;

    }

}
