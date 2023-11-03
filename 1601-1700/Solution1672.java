public class Solution1672 {
  public int maximumWealth(int[][] accounts) {
    int maxWealth = accounts[0][0];
    for (int customer[] : accounts) {
      int currentWealth = 0;
      for (int wealth : customer) {
        currentWealth += wealth;
      }
      maxWealth = Math.max(maxWealth, currentWealth);
    }
    return maxWealth;
  }
}
