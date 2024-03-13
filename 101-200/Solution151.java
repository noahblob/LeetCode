public class Solution151 {
  public String reverseWords(String s) {
    String[] sArr = s.trim().split("\\s+");

    StringBuilder sb = new StringBuilder();
    for (int i = sArr.length - 1; i >= 0; i--) {
      if (!sArr[i].equals("")) {
        sb.append(sArr[i]);
        if (i != 0) {
          sb.append(" ");
        }
      }
    }

    return sb.toString();
  }
}
