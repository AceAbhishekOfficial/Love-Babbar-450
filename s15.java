import java.util.Arrays;

class s15 {
    public void nextPermutation(int[] arr) {
        int idx = -1;
        int n = arr.length;
        for (int a = n - 1; a >= 1; a--) {
            if (arr[a - 1] < arr[a]) {
                idx = a - 1;
                break;
            }
        }
        if (idx == -1) {
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            return;
        }
        for (int a = n - 1; a > idx; a--) {
            if (arr[a] > arr[idx]) {
                int temp = arr[a];
                arr[a] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }
        Arrays.sort(arr, idx + 1, n);

    }
}