import java.util.Random;

public class Solution215 {
  public int findKthLargest(int[] nums, int k) {
    int left = 0, right = nums.length - 1;
    Random rand = new Random();
    while (true) {
      int pivot_index = left + rand.nextInt(right - left + 1);
      // partition the array into two subarrays around a pivot
      int q = partition(nums, left, right, pivot_index);
      if (q == nums.length - k)
        return nums[q];
      else if (q > nums.length - k)
        right = q - 1;
      else
        left = q + 1;
    }
  }

  public int partition(int[] nums, int left, int right, int pivot_index) {
    int pivot = nums[pivot_index];
    int temp = nums[pivot_index];
    nums[pivot_index] = nums[right];
    nums[right] = temp;
    int index = left;
    for (int i = left; i < right; i++) {
      if (nums[i] < pivot) {
        temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
        index++;
      }
    }
    temp = nums[right];
    nums[right] = nums[index];
    nums[index] = temp;
    return index;
  }
}
