import java.util.HashSet;
import java.util.Set;

public class Solution287 {
  public int findDuplicate(int[] nums) {
    Set<Integer> s = new HashSet<Integer>();
    int duplicate = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        s.add(nums[i]);
      } else if (s.contains(nums[i])) {
        duplicate = nums[i];
        return duplicate;
      } else {
        s.add(nums[i]);
      }
    }
    return duplicate;
  }
}
