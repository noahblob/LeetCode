public class Solution223 {
  public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    int areaA = (ax2 - ax1) * (ay2 - ay1);
    int areaB = (bx2 - bx1) * (by2 - by1);

    int overlap, y, x;

    if (by1 >= ay2) {
      return areaA + areaB;
    } else if (bx1 >= ax2) {
      return areaA + areaB;
    } else if (bx2 <= ax1) {
      return areaA + areaB;
    } else if (by2 <= ay1) {
      return areaA + areaB;
    }

    if (by2 <= ay2 && by1 <= ay1) {
      y = by2 - ay1;
    } else if (by2 <= ay2 && by1 >= ay1) {
      y = by2 - by1;
    } else if (by2 >= ay2 && by1 <= ay1) {
      y = ay2 - ay1;
    } else if (by2 >= ay2 && by1 >= ay1) {
      y = ay2 - by1;
    } else if (by2 == ay2 && by1 == ay1) {
      y = ay2 - ay1;
    } else {
      y = 0;
    }

    if (bx2 <= ax2 && bx1 <= ax1) {
      x = bx2 - ax1;
    } else if (bx2 <= ax2 && bx1 >= ax1) {
      x = bx2 - bx1;
    } else if (bx2 >= ax2 && bx1 <= ax1) {
      x = ax2 - ax1;
    } else if (bx2 >= ax2 && bx1 >= ax1) {
      x = ax2 - bx1;
    } else if (bx2 == ax2 && bx1 == ax1) {
      x = ax2 - ax1;
    } else {
      x = 0;
    }

    overlap = x * y;

    return areaA + areaB - overlap;
  }
}
