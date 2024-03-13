import java.util.HashMap;
import java.util.Map;

public class Solution169 {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      if (map.containsKey(num)) {
        int occ = map.get(num);
        occ++;
        map.put(num, occ);
      } else {
        map.put(num, 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > (nums.length / 2)) {
        return entry.getKey();
      }
    }
    return -1;
  }
}
