import java.util.Collections;
import java.util.PriorityQueue;

public class Solution215 {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

    for (int num : nums) {
      heap.add(num);
    }

    int ind = 0;
    while (ind < k - 1) {
      heap.poll();
      ind++;
    }

    return heap.poll();
  }
}
