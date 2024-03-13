public class Solution2390 {
  public String removeStars(String s) {
    StringBuilder sb = new StringBuilder();
    char[] sArr = s.toCharArray();

    for (char c : sArr) {
        if (c == '*') {
            sb.setLength(sb.length() - 1);
        } else {
            sb.append(c);
        }
    }

    return sb.toString();
}
}
