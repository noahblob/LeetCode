public class Solution167 {
  public int[] twoSum(int[] numbers, int target) {
    int[] out = new int[2];
    // start at either end of the array, move right pointer left if it is greater
    // than target,
    // move left pointer right if
    int left = 0;
    int right = numbers.length - 1;

    while (numbers[left] + numbers[right] != target) {
      int sum = numbers[left] + numbers[right];
      if (sum > target) {
        right--;
      } else if (sum < target) {
        left++;
      }
    }
    out[0] = left + 1;
    out[1] = right + 1;
    return out;
  }
}
