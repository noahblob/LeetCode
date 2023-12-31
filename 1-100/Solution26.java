import java.util.HashSet;
import java.util.Set;

public class Solution26 {
  public int removeDuplicates(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int n : nums) {
      set.add(n);
    }

    int i = 0;
    for (Integer n : set) {
      nums[i] = n;
      i++;
    }

    return set.size();
  }
}
