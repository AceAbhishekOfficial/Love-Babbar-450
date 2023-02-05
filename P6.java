import java.util.*;
class Solution
{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> nums = new HashSet<>();
        for (int i:a)
        nums.add(i);
        for(int i:b)
        nums.add(i);
        return nums.size();
    }
}