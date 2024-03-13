import java.util.HashSet;
import java.util.Set;

public class Solution1704 {
  public boolean halvesAreAlike(String s) {
    s = s.toLowerCase();

    Set<Character> set = new HashSet<>();
    set.add('a');
    set.add('e');
    set.add('i');
    set.add('o');
    set.add('u');

    int count1 = 0;
    int count2 = 0;

    for (int i = 0; i < s.length() / 2; i++) {
      if (set.contains(s.charAt(i))) {
        count1++;
      }
      if (set.contains(s.charAt(s.length() - i - 1))) {
        count2++;
      }
    }

    return count1 == count2;
  }
}
