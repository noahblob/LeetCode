import java.util.LinkedList;
import java.util.Queue;

public class Solution994 {
  class Orange {
    int row;
    int col;
    int time;

    public Orange(int row, int col, int time) {
      this.row = row;
      this.col = col;
      this.time = time;
    }
  }

  int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

  public int orangesRotting(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    int orangeCount = 0;

    Queue<Orange> queue = new LinkedList<>();
    // count total fresh oranges, and add roten oranges to BFS queue
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (grid[i][j] == 1) {
          orangeCount++;
        }

        if (grid[i][j] == 2) {
          queue.add(new Orange(i, j, 0));
        }
      }
    }

    int infected = 0;
    int ans = 0;

    while (!queue.isEmpty()) {
      Orange current = queue.poll();
      for (int i = 0; i < 4; i++) {
        int newRow = current.row + dir[i][0];
        int newCol = current.col + dir[i][1];
        ans = Math.max(ans, current.time);
        int newTime = current.time + 1;

        // found orange to infect
        if (newRow >= 0 && newCol >= 0 && newRow < n && newCol < m && grid[newRow][newCol] == 1) {
          queue.add(new Orange(newRow, newCol, newTime));
          grid[newRow][newCol] = 2;
          infected++;
        }
      }

    }

    if (infected == orangeCount) {
      return ans;
    }
    return -1;
  }
}
