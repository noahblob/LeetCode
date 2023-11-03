import java.util.HashMap;

public class Solution1 {
  public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> diffs = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];

      if (diffs.containsKey(diff)) {
        return new int[] { diffs.get(diff), i };
      }

      diffs.put(nums[i], i);
    }

    return new int[] {};
  }
}
