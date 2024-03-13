public class Solution74 {
  public boolean searchMatrix(int[][] matrix, int target) {
    int start = 0;
    int end = matrix[0].length - 1;
    while (start < matrix.length && end > -1) {
      int current = matrix[start][end];
      if (current == target) {
        return true;
      } else if (current < target) {
        // jump down a row
        start++;
      } else { // current > target
        // move across in current row
        end--;
      }
    }
    return false;
  }
}
