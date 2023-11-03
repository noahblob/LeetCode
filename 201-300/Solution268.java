public class Solution268 {
  public int missingNumber(int[] nums) {
    int sumNums = (nums.length * (nums.length + 1)) / 2;

    for (int i = 0; i < nums.length; i++) {
      sumNums -= nums[i];
    }

    return sumNums;
  }
}
