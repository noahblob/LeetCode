import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1291 {
  public List<Integer> sequentialDigits(int low, int high) {
    List<Integer> answer = new ArrayList<>();

    // go through all possible numbers up to 9 digits
    for (int i = 1; i < 10; i++) {
      int num = i;
      for (int j = i + 1; j < 10; j++) {
        num = num * 10 + j;
        if (num >= low && num <= high) {
          answer.add(num);
        }
      }
    }
    // ensure answer is sorted
    Collections.sort(answer);
    return answer;
  }
}
