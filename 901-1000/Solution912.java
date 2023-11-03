public class Solution912 {
  public int[] sortArray(int[] nums) {
    mergeSort(nums, 0, nums.length - 1);
    return nums;
  }

  void combine(int[] nums, int start, int mid, int end) {
    int p1 = start;
    int p2 = mid + 1;
    int[] B = new int[end - start + 1];
    for (int i = 0; i < end - start + 1; i++) {
      if (p1 > mid) {
        B[i] = nums[p2++];
      } else if (p2 > end) {
        B[i] = nums[p1++];
      } else if (nums[p1] > nums[p2]) {
        B[i] = nums[p2++];
      } else {
        B[i] = nums[p1++];
      }
    }

    for (int i = start; i <= end; i++) {
      nums[i] = B[i - start];
    }
  }

  void mergeSort(int[] nums, int start, int end) {
    if (start == end)
      return;

    int mid = (start + end) / 2;
    mergeSort(nums, start, mid);
    mergeSort(nums, mid + 1, end);
    combine(nums, start, mid, end);
  }
}
