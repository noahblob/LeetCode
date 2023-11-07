public class Solution443 {
  public int compress(char[] chars) {
    int n = chars.length;
    char current = chars[0];
    int count = 0;
    int index = 0;
    if (n == 1) {
      return 1;
    }
    for (char c : chars) {
      if (c == current) {
        // found same letter
        count++;
      } else {
        // found different letter
        chars[index++] = current;
        // if only one occurrence, set first index to this character
        if (count > 1) {
          // multiple occurrences of this char
          String str = String.valueOf(count);
          for (char s : str.toCharArray()) {
            chars[index++] = s;
          }
          // reset count
          count = 1;
        }
        current = c;
      }
    }
    chars[index++] = current;
    if (count > 1) {
      String str = String.valueOf(count);
      for (char s : str.toCharArray()) {
        chars[index++] = s;
      }
    }
    return index;
  }
}
