public class Solution80 {
  public int removeDuplicates(int[] nums) {
    int occ = 1;
    int j = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        occ++;
      } else {
        occ = 1;
      }

      if (occ <= 2) {
        nums[j] = nums[i];
        j++;
      }
    }

    return j;
  }
}
