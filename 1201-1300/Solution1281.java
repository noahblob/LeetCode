public class Solution1281 {
  public int subtractProductAndSum(int n) {
    int product = 1;
    int sum = 0;
    char[] digits = String.valueOf(n).toCharArray();

    for (char num : digits) {
      product *= Character.getNumericValue(num);
      sum += Character.getNumericValue(num);
    }

    return product - sum;
  }
}
