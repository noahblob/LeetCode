import java.util.Arrays;

public class Solution1657 {
  public boolean closeStrings(String word1, String word2) {

    if (word1.equals(word2)) {
      return true;
    }

    if (word1.length() != word2.length()) {
      return false;
    }

    int[] frequency1 = new int[26];
    int[] frequency2 = new int[26];

    for (int i = 0; i < word1.length(); i++) {
      frequency1[word1.charAt(i) - 'a']++;
      frequency2[word2.charAt(i) - 'a']++;
    }

    // if one contains a letter the other does not, cannot be close
    for (int i = 0; i < 26; i++) {
      if ((frequency1[i] == 0 && frequency2[i] != 0) || (frequency1[i] != 0 && frequency2[i] == 0)) {
        return false;
      }
    }

    Arrays.sort(frequency1);
    Arrays.sort(frequency2);

    // ensure frequencies are the same in the case of needing to swap letters around
    for (int i = 0; i < 26; i++) {
      if (frequency1[i] != frequency2[i]) {
        return false;
      }
    }

    return true;
  }
}
