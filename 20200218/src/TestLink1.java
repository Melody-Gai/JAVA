
public class TestLink1 {
    static class Node {
        public int data;
        public Node next;
        public Node() {

        }
        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;

    public void insertHead(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }
    public void insertTail(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    public void show() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void show2(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
