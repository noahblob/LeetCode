public class Solution202 {
  public boolean isHappy(int n) {
    // Floyd's Tortoise and Hare algorithm! I learned something new!
    int slow = n;
    int fast = n;

    do {
      // fast and slow will overlap at some point, and at this point it will either be
      // a repeating cycle, or they have both reached 1
      slow = square(slow);
      fast = square(square(fast));
    } while (slow != fast);

    return slow == 1;
  }

  public int square(int n) {
    // calculate the square of the digits of n
    int result = 0;
    while (n > 0) {
      int digit = n % 10;
      n /= 10;
      result += digit * digit;
    }
    return result;
  }
}
