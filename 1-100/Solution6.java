public class Solution6 {
  public String convert(String s, int numRows) {
    // each row is a separate string builder
    StringBuilder[] sbArr = new StringBuilder[numRows];

    // initialise each stringbuilder
    for (int i = 0; i < numRows; i++) {
      sbArr[i] = new StringBuilder();
    }

    int i = 0;
    // create zigzag pattern
    while (i < s.length()) {
      // letters going down
      for (int index = 0; index < numRows && i < s.length(); index++) {
        sbArr[index].append(s.charAt(i++));
      }

      // letters going diagonal
      for (int index = numRows - 2; index > 0 && i < s.length(); index--) {
        sbArr[index].append(s.charAt(i++));
      }
    }

    // form a string
    String out = "";
    for (int j = 0; j < numRows; j++) {
      out = out + sbArr[j].toString();
    }
    return out;
  }
}
