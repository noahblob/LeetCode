import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution49 {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> hm = new HashMap<>();

    for (String str : strs) {
      char[] charArr = str.toCharArray();
      Arrays.sort(charArr);
      String alphabeticStr = new String(charArr);
      if (!hm.keySet().contains(alphabeticStr)) {
        hm.put(alphabeticStr, new ArrayList<>());
      }
      hm.get(alphabeticStr).add(str);
    }

    List<List<String>> ans = new ArrayList<List<String>>();

    for (List<String> strL : hm.values()) {
      ans.add(strL);
    }

    return ans;
  }
}
