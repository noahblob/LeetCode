import java.util.HashMap;
import java.util.HashSet;

public class Solution1207 {
  public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> count = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      count.put(arr[i], 0);
    }
    for (int n : arr) {
      int x = count.get(n);
      x++;
      count.put(n, x);
    }
    HashSet<Integer> unique = new HashSet<>();
    for (Integer i : count.keySet()) {
      unique.add(count.get(i));
    }
    return unique.size() == count.size();
  }
}
