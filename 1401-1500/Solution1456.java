import java.util.HashSet;
import java.util.Set;

public class Solution1456 {
  public int maxVowels(String s, int k) {
    Set<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');

    int maxV = 0;
    int numVowels = 0;
    int p1 = 0;
    int p2 = 0;
    while (p2 < s.length()) {
      if (p2 - p1 >= k) {
        if (vowels.contains(s.charAt(p1))) {
          numVowels--;
        }
        p1++;
      }

      if (vowels.contains(s.charAt(p2))) {
        numVowels++;
        maxV = Math.max(numVowels, maxV);
      }
      p2++;
    }
    return maxV;
  }
}
