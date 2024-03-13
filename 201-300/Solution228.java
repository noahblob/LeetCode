import java.util.ArrayList;
import java.util.List;

public class Solution228 {
  public List<String> summaryRanges(int[] nums) {
    List<String> out = new ArrayList<>();
    if (nums.length == 0) {
      return out;
    }
    if (nums.length == 1) {
      out.add(Integer.toString(nums[0]));
      return out;
    }
    boolean single = true;
    int start = nums[0];
    int end = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1] + 1) {
        end = nums[i];
        single = false;
      } else {
        if (!single) {
          out.add(start + "->" + end);
        } else {
          out.add(Integer.toString(start));
        }
        start = nums[i];
        single = true;
      }
    }

    if (end <= start) {
      out.add(Integer.toString(start));
    } else {
      out.add(start + "->" + end);
    }

    return out;
  }
}
