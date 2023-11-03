import java.util.HashMap;
import java.util.Map;

public class Solution13 {
  public int romanToInt(String s) {

    int num = 0;
    Map<Character, Integer> romans = new HashMap<Character, Integer>();

    // Create a hashmap of the symbols
    romans.put('I', 1);
    romans.put('V', 5);
    romans.put('X', 10);
    romans.put('L', 50);
    romans.put('C', 100);
    romans.put('D', 500);
    romans.put('M', 1000);

    for (int i = 0; i < s.length(); i++) {

      int x = romans.get(s.charAt(i));
      int y = romans.get(s.charAt(i));
      if (i < s.length() - 1) {
        y = romans.get(s.charAt(i + 1));
      }

      if (x < y) {
        num += (y - x);
        i++;
      } else if (x >= y) {
        num += x;
      } else {
        num += x;
      }
    }
    return num;
  }
}
