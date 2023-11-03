public class Solution88 {
  public void merge(int[] nums1, int m, int[] nums2, int n) {

    if (nums2.length <= 0) {
      return;
    }
    int[] newArr = new int[m + n];
    int p1 = 0;
    int p2 = 0;
    for (int i = 0; i < m + n; i++) {
      // if pointer1 has reached end of first array
      if (p1 >= m) {
        newArr[i] = nums2[p2];
        p2++;
      } else if (p2 >= n) {
        newArr[i] = nums1[p1];
        p1++;
      } else if (nums1[p1] > nums2[p2]) {
        newArr[i] = nums2[p2];
        p2++;
      } else {
        newArr[i] = nums1[p1];
        p1++;
      }
    }

    int i = 0;
    for (int num : newArr) {
      nums1[i] = num;
      i++;
    }
  }
}
