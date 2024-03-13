public class Solution79 {
  public boolean exist(char[][] board, String word) {
    int m = board[0].length; // cols
    int n = board.length; // rows
    boolean[][] visited = new boolean[n][m];
    // find first letter and begin backtrack
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < m; col++) {
        if (board[row][col] == word.charAt(0)) {
          if (backtrack(board, visited, word, 0, m, n, row, col)) {
            return true;
          }
        }
      }

    }
    return false;
  }

  public boolean backtrack(char[][] board, boolean[][] visited, String word, int ind, int m, int n, int row, int col) {
    if (ind == word.length()) {
      return true;
    }

    // if row or col out of bounds
    if (row < 0 || row >= n || col < 0 || col >= m) {
      return false;
    }

    // current letter is already visited or is not the character we are looking for
    if (visited[row][col] || board[row][col] != word.charAt(ind)) {
      return false;
    }

    visited[row][col] = true;

    // check all directions around current letter
    boolean check = backtrack(board, visited, word, ind + 1, m, n, row + 1, col) ||
        backtrack(board, visited, word, ind + 1, m, n, row, col + 1) ||
        backtrack(board, visited, word, ind + 1, m, n, row - 1, col) ||
        backtrack(board, visited, word, ind + 1, m, n, row, col - 1);

    // backtracking
    visited[row][col] = false;
    return check;
  }
}
