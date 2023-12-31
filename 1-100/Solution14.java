public class Solution14 {
  public String longestCommonPrefix(String[] strs) {
    String prefix = "";
    String[] first = strs[0].split("");
    int len = first.length;
    // find shortest string
    for (String str : strs) {
      if (str.length() < len) {
        len = str.length();
      }
    }

    for (int i = 0; i < len; i++) {
      String cur = first[i];
      for (int j = 1; j < strs.length; j++) {
        if (!strs[j].split("")[i].equals(cur)) {
          return prefix;
        }
      }
      prefix = prefix + cur;
    }

    return prefix;
  }
}
