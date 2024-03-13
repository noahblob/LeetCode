public class Solution4 {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int p1 = 0;
    int p2 = 0;

    int[] nums = new int[nums1.length + nums2.length];
    // construct sorted array of elements
    for (int i = 0; i < (nums1.length + nums2.length); i++) {
      if (p1 >= nums1.length) {
        nums[i] = nums2[p2];
        p2++;
      } else if (p2 >= nums2.length) {
        nums[i] = nums1[p1];
        p1++;
      } else if (nums1[p1] < nums2[p2]) {
        nums[i] = nums1[p1];
        p1++;
      } else {
        nums[i] = nums2[p2];
        p2++;
      }
    }

    // find median depending on polarity of array
    if (nums.length % 2 == 0) {
      return (nums[(nums.length - nums.length / 2)] + nums[(nums.length - nums.length / 2 - 1)]) / 2.0;
    } else {
      return nums[nums.length / 2];
    }
  }
}
