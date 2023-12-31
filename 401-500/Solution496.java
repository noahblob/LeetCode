public class Solution496 {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {

    int[] ans = new int[nums1.length];

    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length; j++) {
        if (nums1[i] == nums2[j]) {
          if (j == nums2.length - 1) {
            ans[i] = -1;
            break;
          } else if (j < nums2.length - 1) {
            for (int k = j; k < nums2.length; k++) {
              if (nums2[k] > nums2[j]) {
                ans[i] = nums2[k];
                break;
              } else {
                ans[i] = -1;
              }
            }
          } else {
            ans[i] = -1;
            break;
          }
        }
      }
    }
    return ans;
  }
}
