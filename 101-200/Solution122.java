public class Solution122 {
  public int maxProfit(int[] prices) {
    int least = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : prices) {
      if (price < least) {
        least = price;
      }

      if (price > least) {
        maxProfit += price - least;
        least = price;
      }
    }

    return maxProfit;
  }
}
