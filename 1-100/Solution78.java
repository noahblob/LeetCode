import java.util.ArrayList;
import java.util.List;

public class Solution78 {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(0, result, new ArrayList<>(), nums);
    return result;
  }

  public void dfs(int idx, List<List<Integer>> result, List<Integer> subset, int[] nums) {
    // if we have exceeded number of elements in nums, that will be our max subset
    result.add(new ArrayList<>(subset));
    for (int i = idx; i < nums.length; i++) {
      // including number
      subset.add(nums[i]);
      dfs(i + 1, result, subset, nums);
      // excluding number
      subset.remove(subset.size() - 1);
    }
  }
}
