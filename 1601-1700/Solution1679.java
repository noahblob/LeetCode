import java.util.HashMap;
import java.util.Map;

public class Solution1679 {
  public int maxOperations(int[] nums, int k) {
    int operations = 0;
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (num > 0) {
        if (map.containsKey(k - num)) {
          operations++;

          // if we have only found this difference once, remove it from our map
          if (map.get(k - num) == 1) {
            map.remove(k - num);
          } else { // otherwise just decrement the freq
            map.put(k - num, map.get(k - num) - 1);
          }
        } else {
          // getOrDefault will get the current freq of nums[i], or default it to 0
          // this will either start out the frequency of a diff as 1 or increment the
          // frequency
          map.put(num, map.getOrDefault(nums[i], 0) + 1);
        }
      }
    }

    return operations;
  }
}
