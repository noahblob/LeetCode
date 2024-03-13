import java.util.HashSet;
import java.util.Set;

public class Solution345 {
  public String reverseVowels(String s) {
    Set<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    vowels.add('A');
    vowels.add('E');
    vowels.add('I');
    vowels.add('O');
    vowels.add('U');

    int p1 = 0;
    int p2 = s.length() - 1;
    char[] sArr = s.toCharArray();

    while (p1 < p2) {
      while (p1 < p2 && !vowels.contains(sArr[p1])) {
        p1++;
      }

      while (p1 < p2 && !vowels.contains(sArr[p2])) {
        p2--;
      }

      swap(sArr, p1, p2);
      p1++;
      p2--;
    }
    return new String(sArr);
  }

  public void swap(char[] sArr, int i, int j) {
    char temp = sArr[i];
    sArr[i] = sArr[j];
    sArr[j] = temp;
  }
}
