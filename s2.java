class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> ans = new ArrayList<>();
        int min = arr[0];
        int max = arr[0];
        for(int i: arr) {
            if (i>max)
                max = i;
            if (i<min)
                min = i;
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
