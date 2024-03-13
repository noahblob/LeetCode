import java.util.ArrayList;
import java.util.List;

public class Solution46 {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(result, new ArrayList<>(), nums);
    return result;
  }

  public void dfs(List<List<Integer>> result, List<Integer> perm, int[] nums) {
    if (perm.size() == nums.length) {
      result.add(new ArrayList<>(perm));
    } else {
      for (int i = 0; i < nums.length; i++) {
        // skip when permutation already has this number
        if (perm.contains(nums[i])) {
          continue;
        }
        perm.add(nums[i]);
        dfs(result, perm, nums);
        perm.remove(perm.size() - 1);
      }
    }
  }
}
