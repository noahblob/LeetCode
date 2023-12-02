import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2215 {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    List<Integer> arr1 = new ArrayList<>();
    List<Integer> arr2 = new ArrayList<>();

    for (int n : nums1) {
      set1.add(n);
    }

    for (int n : nums2) {
      set2.add(n);
    }

    for (int n : set1) {
      if (!set2.contains(n)) {
        arr1.add(n);
      }
    }

    for (int n : set2) {
      if (!set1.contains(n)) {
        arr2.add(n);
      }
    }

    List<List<Integer>> ans = new ArrayList<>();

    ans.add(arr1);
    ans.add(arr2);
    return ans;
  }
}