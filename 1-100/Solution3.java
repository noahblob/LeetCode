import java.util.HashSet;
import java.util.Set;

public class Solution3 {
  public int lengthOfLongestSubstring(String s) {

    if (s.length() <= 1) {
      return s.length();
    }

    int p1 = 0;
    int p2 = 1;
    Set<Character> letters = new HashSet<>();
    letters.add(s.charAt(p1));
    int longest = 0;

    while (p2 < s.length()) {
      if (!letters.contains(s.charAt(p2))) {
        letters.add(s.charAt(p2));
        p2++;
      } else {
        letters.remove(s.charAt(p1));
        p1++;
      }

      if (p2 - p1 >= longest) {
        longest = p2 - p1;
      }
    }
    return longest;
  }
}
