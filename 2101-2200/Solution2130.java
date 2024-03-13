import java.util.Stack;

public class Solution2130 {
  public int pairSum(ListNode head) {
    int maxSum = 0;

    Stack<Integer> stack = new Stack<>();
    ListNode current = head;
    while (current != null) {
      stack.push(current.val);
      current = current.next;
    }

    while (stack.size() > stack.size() / 2) {
      maxSum = Math.max(maxSum, head.val + stack.pop());
      head = head.next;
    }

    return maxSum;
  }
}
