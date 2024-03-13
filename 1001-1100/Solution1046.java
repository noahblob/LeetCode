import java.util.Collections;
import java.util.PriorityQueue;

public class Solution1046 {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
    for (int stone : stones) {
      heap.offer(stone);
    }

    int firstNum = 0;
    int secondNum = 0;
    while (heap.size() > 1) {
      firstNum = heap.poll();
      secondNum = heap.poll();

      if (firstNum > secondNum) {
        heap.offer(firstNum - secondNum);
      }
    }

    return heap.isEmpty() ? 0 : heap.poll();
  }
}
