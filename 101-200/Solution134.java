public class Solution134 {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    // if some index i in the array leads to an overall deficit, every index between
    // where i started and finished will also lead to a deficit if they are used as
    // the starting point, hence when we find one trip that results in a deficit, we
    // can reset our starting point the the index i where the deficit happened + 1
    int start = 0;
    int totalSurplus = 0;
    int currentSurplus = 0;
    for (int i = 0; i < gas.length; i++) {
      totalSurplus += gas[i] - cost[i];
      currentSurplus += gas[i] - cost[i];
      // if our current surplus is negative, we need to move our starting position
      // along
      if (currentSurplus < 0) {
        currentSurplus = 0;
        start = i + 1;
      }
    }

    return totalSurplus < 0 ? -1 : start;
  }
}
