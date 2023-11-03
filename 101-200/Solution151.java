public class Solution151 {
  public String reverseWords(String s) {
    String[] words = s.trim().split("\\s+");
    int n = words.length;
    String[] b = new String[n];
    int j = n;
    for (int i = 0; i < n; i++) {
      b[j - 1] = words[i];
      j--;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (!b[i].equals("")) {
        sb.append(b[i]);
        if (i < n - 1) {
          sb.append(" ");
        }
      }
    }

    return sb.toString();
  }
}
