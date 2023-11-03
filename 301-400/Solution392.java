public class Solution392 {
  public boolean isSubsequence(String s, String t) {
    if (s.length() == 0) {
      return true;
    }

    int subCount = 0;

    int j = 0;

    for (int i = 0; i < t.length(); i++) {
      if (j < s.length()) {
        if (s.charAt(j) == (t.charAt(i))) {
          subCount++;
          j++;
        }
      }

    }

    return subCount == s.length();
  }
}
