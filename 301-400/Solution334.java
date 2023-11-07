public class Solution334 {
  public boolean increasingTriplet(int[] nums) {
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;
    for (int num : nums) {
      if (num <= first && num < second) {
        // first small value of triplet is found
        first = num;
      } else if (num > first && num <= second) {
        // second smallest value of triplet is found
        second = num;
      } else {
        // if we find a third value in the triplet, return true
        return true;
      }
    }
    return false;
  }
}
