import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40 {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    // deal with duplicates
    Arrays.sort(candidates);
    backtrack(0, result, new ArrayList<>(), candidates, target, 0);
    return result;
  }

  public void backtrack(int idx, List<List<Integer>> result, List<Integer> sum, int[] candidates, int target,
      int currentSum) {
    if (currentSum == target) {
      result.add(new ArrayList<>(sum));
    } else if (currentSum > target) {
      return;
    } else {
      for (int i = idx; i < candidates.length; i++) {
        if (i > idx && candidates[i] == candidates[i - 1]) {
          continue;
        }
        sum.add(candidates[i]);
        backtrack(i + 1, result, sum, candidates, target, currentSum + candidates[i]);
        sum.remove(sum.size() - 1);
      }
    }
  }
}
