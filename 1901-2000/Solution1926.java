import java.util.LinkedList;
import java.util.Queue;

public class Solution1926 {
  class Pair {
    int row, col, step;

    Pair(int row, int col, int step) {
      this.row = row;
      this.col = col;
      this.step = step;
    }
  }

  int[][] directions = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

  public int nearestExit(char[][] maze, int[] entrance) {
    int row = entrance[0];
    int col = entrance[1];
    int m = maze.length;
    int n = maze[0].length;

    boolean[][] visited = new boolean[m][n];
    Queue<Pair> queue = new LinkedList<>();

    visited[row][col] = true;
    queue.add(new Pair(row, col, 0));

    while (!queue.isEmpty()) {
      Pair currentPos = queue.poll();
      int currentRow = currentPos.row;
      int currentCol = currentPos.col;
      int currentDepth = currentPos.step;

      if ((currentRow == 0 || currentCol == 0 || currentRow == m - 1 || currentCol == n - 1)
          && !(currentRow == entrance[0] && currentCol == entrance[1])) {
        return currentDepth;
      }

      for (int[] dir : directions) {
        int newRow = currentRow + dir[0];
        int newCol = currentCol + dir[1];

        if (newRow >= 0 && newCol >= 0 && newRow < m && newCol < n) {
          if (!visited[newRow][newCol] && maze[newRow][newCol] == '.') {
            visited[newRow][newCol] = true;
            queue.add(new Pair(newRow, newCol, currentPos.step + 1));
          }
        }
      }
    }

    return -1;
  }
}
