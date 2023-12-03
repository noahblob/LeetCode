public class Solution11 {
  public int maxArea(int[] height) {
    int largest = 0;
    int n = height.length;
    int p1 = 0;
    int p2 = n - 1;

    for (int i = 0; i < n; i++) {
      int newArea = 0;
      if (height[p1] > height[p2]) {
        newArea = (p2 - p1) * height[p2];
        p2--;
      } else {
        newArea = (p2 - p1) * height[p1];
        p1++;
      }
      if (newArea > largest) {
        largest = newArea;
      }
    }

    return largest;
  }
}
