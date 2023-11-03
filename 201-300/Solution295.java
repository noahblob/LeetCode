import java.util.Collections;
import java.util.PriorityQueue;

public class Solution295 {
  PriorityQueue<Double> pq1 = new PriorityQueue<>();
  PriorityQueue<Double> pq2 = new PriorityQueue<>(Collections.reverseOrder());

  public MedianFinder() {
        
    }

  public void addNum(int num) {
    pq1.offer(num * 1.0);
    pq2.offer(pq1.poll());
    if (pq2.size() > pq1.size()) {
      pq1.offer(pq2.poll());
    }
  }

  public double findMedian() {
    if (pq1.size() == pq2.size()) {
      double median = (pq1.peek() + pq2.peek()) / 2;
      return median;
    } else {
      return pq1.peek();
    }
  }
}
