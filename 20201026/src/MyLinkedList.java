/**
 * @program: 20201026
 * @description：
 * @author: GAI
 * @create: 2020-10-26 17:44
 **/

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {

    public Node head;

    public void addFirst(int data){
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addList(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node car = this.head;
        while (car.next != null) {
            car = car.next;
        }
        car.next = node;
    }

    public boolean contains(int key) {

        Node cur = this.head;
        while(cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public int size() {

        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void addIndex(int index,int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == this.size()) {
            addList(data);
            return;
        }
        Node node = new Node(data);
        Node cur = searchIndex(index);
        node.next = cur.next;
        cur.next = node;

    }

    private  Node searchIndex(int index) {
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("index位置不合法！");
        }
        Node cur = this.head;

        while(index - 1 != 0) {
            cur = cur.next;
            index--;
        }

       /* for (int i = 0;i < index - 1;i++) {
            cur = cur.next;
        }*/
        return cur;
    }

    private Node searchPrev(int key) {
        Node prev = this.head;
        while(prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }else  {
                prev = prev.next;
            }
        }
        return null;
    }

    public void remove(int key) {
        if (this.head == null) {
            return;
        }

        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrev(key);
        if (prev == null) {
            System.out.println("没有该节点");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;

    }

    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }
}
