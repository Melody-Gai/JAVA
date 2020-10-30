/**
 * @program: 20201030
 * @description：
 * @author: GAI
 * @create: 2020-10-30 18:01
 **/

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(Node next) {
        this.next = next;
    }
}

public class TestDemo {

    public Node head;

    public Node reverseList ( ) {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public void display(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public Node medium() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
