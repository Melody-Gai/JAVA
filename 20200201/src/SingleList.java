
class ListNode {
    public int data;
    public ListNode next;
    public ListNode (int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleList {
    public ListNode head;
    public SingleList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addList(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null) {
            this.head = node;
        }else{
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    //打印
    public void display() {
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while(cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //清屏
    public void clear() {
        //this.head = null;
        while(this.head.next != null) {
            ListNode cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }
}














