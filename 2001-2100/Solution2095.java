public class Solution2095 {
  public ListNode deleteMiddle(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode current = new ListNode(0);
    current.next = head;
    ListNode slow = current;
    ListNode fast = head;

    // fast will travel to the end of the array twice as fast, once fast reaches
    // end, slow is at middle.
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    slow.next = slow.next.next;
    return current.next;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int x) {
    val = x;
  }

  ListNode(int x, ListNode next) {
    val = x;
    this.next = next;
  }
}
