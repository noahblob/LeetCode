import java.util.Arrays;

public class Solution435 {
  public int eraseOverlapIntervals(int[][] intervals) {
    // Sort elements in order of increasing last value
    Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
    int overlapping = 1;
    int prev = 0;
    for (int i = 0; i < intervals.length; i++) {
      if (intervals[i][0] >= intervals[prev][1]) {
        prev = i;
        overlapping++;
      }
    }

    return intervals.length - overlapping;
  }
}
