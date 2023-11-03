import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> result = new ArrayList<>();
    int maxCandies = 0;

    for (int candy : candies) {
      if (candy > maxCandies) {
        maxCandies = candy;
      }
    }

    for (int i = 0; i < candies.length; i++) {
      if (candies[i] + extraCandies >= maxCandies) {
        result.add(true);
      } else {
        result.add(false);
      }
    }

    return result;
  }
}
