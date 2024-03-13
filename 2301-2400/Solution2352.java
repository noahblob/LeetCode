public class Solution2352 {
  public int equalPairs(int[][] grid) {
    int n = grid.length;
    int pairs = 0;
    boolean matching = false;
    for (int i = 0; i < n; i++) {
      int[] row = grid[i];
      // compare current row against every column
      for (int j = 0; j < n; j++) {
        // first element of column is first element of row
        if (grid[0][j] == row[0]) {
          for (int k = 0; k < n; k++) {
            if (row[k] == grid[k][j]) {
              matching = true;
            } else {
              matching = false;
              break;
            }
          }
          if (matching) {
            pairs++;
          }
        }
      }
    }
    return pairs;
  }
}
