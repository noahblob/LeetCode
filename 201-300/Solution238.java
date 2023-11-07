class Solution283 {
  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    int prefixProduct = 1;
    int suffixProduct = 1;

    for (int i = 0; i < n; i++) {
      ans[i] = prefixProduct;
      prefixProduct *= nums[i];
    }

    for (int i = n - 1; i >= 0; i--) {
      ans[i] *= suffixProduct;
      suffixProduct *= nums[i];
    }
    return ans;
  }
}