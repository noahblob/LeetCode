public class Solution121 {
  public int maxProfit(int[] prices) {
    int least = prices[0];
    int maxProfit = 0;
    int newProfit = 0;
    int n = prices.length;

    for (int price : prices) {
      if (price < least) {
        least = price;
      }

      newProfit = price - least;

      if (newProfit > maxProfit) {
        maxProfit = newProfit;
      }
    }
    return maxProfit;
  }
}
