public class Solution34 {
  public int[] searchRange(int[] nums, int target) {
    if (nums.length <= 0) {
      return new int[] { -1, -1 };
    }
    int left = 0;
    int right = nums.length - 1;
    // find left index
    while (left < right) {
      int mid = (left + right) / 2;
      if (nums[mid] >= target) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    int indexOne = left;
    if (nums[indexOne] != target) {
      return new int[] { -1, -1 };
    }

    left = 0;
    right = nums.length - 1;
    // find right index
    while (left < right) {
      int mid = (int) Math.ceil((left + right) / 2.0);
      if (nums[mid] <= target) {
        left = mid;
      } else {
        right = mid - 1;
      }
    }
    int indexTwo = right;

    return new int[] { indexOne, indexTwo };
  }
}
