import java.util.*;
class Solution
{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int a=0;a<k;a++)
        pq.add(arr[a]);
        for(int a=k;a<arr.length;a++)
        {
            if(pq.peek()>arr[a])
            {
                pq.poll();
                pq.add(arr[a]);
            }
        }
        return pq.peek();
    } 
}