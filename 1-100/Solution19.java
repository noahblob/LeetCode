public class Solution19 {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    // find length of entire list
    int size = 0;
    ListNode current = head;
    while (current != null) {
      current = current.next;
      size++;
    }

    // get index to be removed
    int ind = size - n;
    int point = 0;
    current = head;
    if (ind == 0) {
      head = head.next;
      return head;
    }
    while (point != ind - 1 && current.next != null) {
      current = current.next;
      point++;
    }

    if (current.next != null) {
      if (current.next.next != null) {
        current.next = current.next.next;
      } else {
        current.next = null;
      }
    }

    return head;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int x) {
    val = x;
    next = null;
  }

  ListNode(int x, ListNode next) {
    val = x;
    this.next = next;
  }
}