import java.util.ArrayList;
import java.util.List;

public class Solution39 {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    // a number in the sum must be less than or equal to target
    List<List<Integer>> result = new ArrayList<>();
    dfs(0, result, new ArrayList<>(), 0, target, candidates);
    return result;
  }

  public void dfs(int idx, List<List<Integer>> result, List<Integer> sum, int currentSum, int target,
      int[] candidates) {
    if (currentSum > target) {
      return;
    } else if (currentSum == target) {
      result.add(new ArrayList<>(sum));
    } else {
      for (int i = idx; i < candidates.length; i++) {
        sum.add(candidates[i]);
        dfs(i, result, sum, currentSum + candidates[i], target, candidates);
        sum.remove(sum.size() - 1);
      }
    }
  }
}
