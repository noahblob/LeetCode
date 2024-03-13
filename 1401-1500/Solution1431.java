import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> out = new ArrayList<>();

    // find max candies
    int max = 0;
    for (int candy : candies) {
      if (candy > max) {
        max = candy;
      }
    }

    for (int candy : candies) {
      if (candy + extraCandies >= max) {
        out.add(true);
      } else {
        out.add(false);
      }
    }

    return out;
  }
}
