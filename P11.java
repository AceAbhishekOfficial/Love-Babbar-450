import java.util.HashSet;
class Solution 
{
    public int findDuplicate(int[] nums) 
    {
      HashSet<Integer> hm = new HashSet<>();
      for(int i:nums)
      {
          if(hm.contains(i))
          return i;
          else
          hm.add(i);
      }
      return -1;
    }
}