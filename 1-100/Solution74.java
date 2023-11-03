public class Solution74 {
  public boolean searchMatrix(int[][] matrix, int target) {

    int n = Integer.MAX_VALUE;

    if (matrix[0][0] == target) {
      return true;
    }
    for (int i = 0; i < matrix.length; i++) {
      int low = 0;
      int high = matrix[i].length - 1;
      while (low <= high) {
        int mid = low + ((high - low) / 2);
        if (matrix[i][mid] < target) {
          low = mid + 1;
        } else if (matrix[i][mid] > target) {
          high = mid - 1;
        } else {
          n = target;
          break;
        }
      }
    }
    System.out.println(n);
    return n == target;
  }
}
