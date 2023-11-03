public class Solution66 {
  public int[] plusOne(int[] digits) {

    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        // if digit current digit is less than 9, can update digits and return
        // immediately
        digits[i]++;
        return digits;
      }
      // otherwise the current digit needs to be set to 0
      digits[i] = 0;
    }

    // if all digits were 9 i.e. [9,9,9,9] then result will be [0,0,0,0] but we want
    // to return [1,0,0,0,0]
    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }
}
