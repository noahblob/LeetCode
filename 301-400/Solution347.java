import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution347 {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> hm = new HashMap<>();
    int[] freq = new int[k];
    for (int num : nums) {
      if (!hm.keySet().contains(num)) {
        hm.put(num, 1);
      } else {
        hm.merge(num, 1, Integer::sum);
      }
    }
    // get k most frequent values from hashmap

    List<Integer> list = new ArrayList<>(hm.keySet());
    Collections.sort(list, new Comparator<Integer>() {
      public int compare(Integer x, Integer y) {
        return hm.get(y) - hm.get(x);
      }
    });

    for (int i = 0; i < k; i++) {
      freq[i] = list.get(i);
    }

    return freq;
  }
}
