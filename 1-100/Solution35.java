public class Solution35 {
  public int searchInsert(int[] nums, int target) {
    // binary search!!!!

    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = (end + start) / 2;
      if (target == nums[mid]) {
        return mid;
      } else if (target > nums[mid]) {
        start = mid + 1;
      } else { // target < num[mid];
        end = mid - 1;
      }
    }
    return start;
  }
}
