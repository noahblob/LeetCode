public class Solution290 {
  public boolean wordPattern(String pattern, String s) {
    // find how many unique words are in s, and compare that to how many unique
    // letters are in pattern
    if (pattern.length() != s.split(" ").length) {
      return false;
    }

    int n = pattern.length();
    String[] sArr = s.split(" ");
    HashMap<String, Character> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      if (!map.containsKey(sArr[i])) {
        if (!map.containsValue(pattern.charAt(i))) {
          map.put(sArr[i], pattern.charAt(i));
        } else {
          return false;
        }
      } else {
        if (map.get(sArr[i]) != pattern.charAt(i)) {
          return false;
        }
      }
    }
    return true;
  }
}
