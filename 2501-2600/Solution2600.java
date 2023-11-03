public class Solution2600 {
  public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
    if (numOnes >= k) {
      return k;
    }

    int x = 0;
    while (numOnes != 0 && k != 0) {
      x++;
      numOnes--;
      k--;
    }
    while (numZeros != 0 && k != 0) {
      numZeros--;
      k--;
    }
    while (numNegOnes != 0 && k != 0) {
      x--;
      numNegOnes--;
      k--;
    }
    return x;
  }
}
