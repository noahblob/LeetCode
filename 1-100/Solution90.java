import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90 {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    // if nums is sorted, we can deal with duplicates easier
    Arrays.sort(nums);
    backtrack(0, result, nums, new ArrayList<>());
    return result;
  }

  public void backtrack(int idx, List<List<Integer>> result, int[] nums, List<Integer> subset) {
    result.add(new ArrayList<>(subset));
    for (int i = idx; i < nums.length; i++) {
      // if duplicate found, skip
      if (i > idx && nums[i] == nums[i - 1]) {
        continue;
      }
      subset.add(nums[i]);
      backtrack(i + 1, result, nums, subset);
      subset.remove(subset.size() - 1);
    }
  }
}
