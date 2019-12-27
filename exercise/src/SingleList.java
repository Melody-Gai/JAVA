import java.util.List;
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
    public void addLast (int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null) {
            this.head = node;
        }else  {
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    //打印单链表
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
    private ListNode searchIndex(int index) {
        ListNode prev = this.head;
        int count = 0;
        while(count < index - 1) {
            prev = prev.next;
            count++;
        }
        return prev;
    }
    public boolean addIndex(int index,int data) {
        if(index < 0 || index > getLength()) {
            return false;
        }
        if(index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        return false;
    }
    public int getLength() {
        int count = 0;
        ListNode cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public boolean contains(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public ListNode contains2(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    private ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    public void remove(int key) {
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        ListNode prev = searchPrev(key);
        if(prev == null) {
            System.out.println("没有你要删除的节点");
            return;
        }
        ListNode del = prev.next;
        prev.next = del.next;
    }
    public void removeAllKey(int key) {
        ListNode cur = this.head.next;
        ListNode prev = this.head;
        while(cur != null) {
            if(prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
    public void clear() {
        while(this.head.next != null) {
            ListNode cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }
    public ListNode reverseList1() {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.next == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = cur.next;
        }
        return newHead;
    }

    //合并两个单链表
    public static ListNode mergeTwoLists(ListNode headA,ListNode headB) {
        ListNode node = new ListNode(-1);
        ListNode newHead = null;
        ListNode tmp = node;
        while(headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if(headA == null) {
            tmp.next = headA;
        }
        if(headB == null) {
            tmp.next = headB;
        }
        return newHead.next;
    }

}