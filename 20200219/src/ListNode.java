
public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode removeElements (ListNode head, int val) {
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode cur = prev;
        while (cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return prev.next;
    }

}

