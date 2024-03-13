public class Solution9 {
  public boolean isPalindrome(int x) {
    // no negative number can read as a palindrome
    if (x < 0) {
      return false;
    }

    int reversed = 0;
    int actual = x;
    while (x > 0) {
      int digit = x % 10;
      reversed = reversed * 10 + digit;
      x /= 10;
    }

    return (actual == reversed);
  }
}
