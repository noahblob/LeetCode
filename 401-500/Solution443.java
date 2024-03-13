public class Solution443 {
  public int compress(char[] chars) {
    char currentChar = chars[0];
    int charCount = 0;
    int index = 0;

    for (char c : chars) {
      if (c == currentChar) {
        charCount++;
      } else {
        chars[index++] = currentChar;
        if (charCount > 1) {
          String numChars = String.valueOf(charCount);
          for (char s : numChars.toCharArray()) {
            chars[index++] = s;
          }
        }
        currentChar = c;
        charCount = 1;
      }
    }
    chars[index++] = currentChar;
    if (charCount > 1) {
      String numChars = String.valueOf(charCount);
      for (char s : numChars.toCharArray()) {
        chars[index++] = s;
      }
    }
    return index;
  }
}
