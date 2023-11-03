public class Solution125 {
  public boolean isPalindrome(String s) {
    if (s.length() == 0) {
      return true;
    }
    int start = 0;
    int end = s.length() - 1;
    while (start <= end) {
      char first = s.charAt(start);
      char last = s.charAt(end);
      if (!Character.isLetterOrDigit(first)) {
        start++;
      } else if (!Character.isLetterOrDigit(last)) {
        end--;
      } else if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
        return false;
      } else {
        start++;
        end--;
      }

    }
    return true;
  }
}
