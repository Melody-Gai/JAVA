/**
 * @program: 20201030
 * @description：
 * @author: GAI
 * @create: 2020-10-30 22:23
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

public class Test {
    public static void main(String[] args) {
        System.out.println();
    }
    public Node head;
    public boolean hasCycle(Node head) {
        Node cur = this.head;
        Node fast = cur;
        Node slow = cur;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
