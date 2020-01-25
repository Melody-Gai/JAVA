import java.util.List;
//链表面试题
//1、删除链表中等于给定值 **val** 的所有节点。

//2、反转一个单链表。\
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class SingleList {
    public ListNode head;
    public SingleList () {
        this.head = null;
    }
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }

    }

    public static void main(String[] args) {

    }
    public void Switch () {
        ListNode cur = this.head.next;
        ListNode prev = this.head;
        ListNode curNext = this.head.next.next;
        ListNode newHead = null;
        while (cur != null) {
            ListNode prev = null;
            cur.next = prev;
            prev = cur;
            cur = curNext;

        }
        if(curNext == null) {
            newHead = cur;
        }
    }
}

