public class Solution162 {
  public int findPeakElement(int[] nums) {
    int n = nums.length;

    // base cases where array is 1 element, start of array is peak, end of array is
    // peak
    if (n <= 1) {
      return 0;
    }

    if (nums[n - 1] > nums[n - 2]) {
      return n - 1;
    }

    if (nums[0] > nums[1]) {
      return 0;
    }

    int start = 1;
    int end = n - 2;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      // middle is greater than element on either side
      if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
        return mid;
      } else if (nums[mid] < nums[mid + 1]) { // number is less than number after it
        start = mid + 1;
      } else if (nums[mid] < nums[mid - 1]) { // number is less than number before it
        end = mid - 1;
      }
    }

    return -1;
  }
}
