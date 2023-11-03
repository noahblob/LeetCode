public class Solution21 {
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x) {
      val = x;
    }

    ListNode(int x, ListNode n) {
      val = x;
      next = n;
    }

  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);
    ListNode temp = dummy;
    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        temp.next = list1;
        list1 = list1.next;
      } else if (list2.val <= list1.val) {
        temp.next = list2;
        list2 = list2.next;
      }
      temp = temp.next;
    }
    if (list1 == null) {
      temp.next = list2;
    } else {
      temp.next = list1;
    }
    return dummy.next;
  }
}
