import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
  public boolean isValidSudoku(char[][] board) {
      int n = 9;

      Map<Integer, Set<Integer>> cols = new HashMap<>();

      for (int i = 0; i < n; i++) {
          cols.put(Integer.valueOf(i), new HashSet<Integer>());
      }

      Set<Integer> square1 = new HashSet<>();
      Set<Integer> square2 = new HashSet<>();
      Set<Integer> square3 = new HashSet<>();

      for (int i = 0; i < n; i++) {
          Set<Integer> row = new HashSet<>();
          // move on to next set of squares
          if (i % 3 == 0) {
              square1 = new HashSet<>();
              square2 = new HashSet<>();
              square3 = new HashSet<>();
          }
          for (int j = 0; j < n; j++) {
              if (board[i][j] != '.') {
                  int num = Character.getNumericValue(board[i][j]);
                  // check columns
                  if (cols.get(j).contains(num)) {
                      return false;
                  } else {
                      cols.get(j).add(num);
                  }

                  // check rows
                  if (row.contains(num)) {
                      return false;
                  } else {
                      row.add(num);
                  }

                  // check 3x3
                  if (j < 3) {
                      if (square1.contains(num)) {
                          return false;
                      } else {
                          square1.add(num);
                      }
                  } else if (j >= 3 && j < 6) {
                      if (square2.contains(num)) {
                          return false;
                      } else {
                          square2.add(num);
                      }
                  } else if (j >= 6 && j < 9) {
                      if (square3.contains(num)) {
                          return false;
                      } else {
                          square3.add(num);
                      }
                  }
              }
              
          }
      }

      return true;
  }
}