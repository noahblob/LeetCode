public class Solution875 {
  public int minEatingSpeed(int[] piles, int h) {
    int left = 1;
    int right = Integer.MAX_VALUE;

    while (left < right) {
      int k = left + (right - left) / 2;
      // check if this middle value is enough
      int time = 0;
      for (int i = 0; i < piles.length; i++) {
        if (piles[i] <= k) { // eat a whole pile and increment time
          time++;
        } else { //
          time += (piles[i] + k - 1) / k;
        }
      }

      if (time > h) { // if we took longer than max time, need to eat faster
        left = k + 1;
      } else {
        right = k;
      }
    }

    return left;
  }
}
