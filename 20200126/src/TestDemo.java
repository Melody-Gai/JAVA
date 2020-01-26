import java.util.list;
class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class SingleLest {
    public ListNode head;
    public SingleLest() {
        this.head = null;
    }

    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    public void addLast (int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null) {
            this.head = node;
        }else {
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    public void display() {
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while(cur != null) {
            System.out.println(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public ListNode searchIndex(int data) {
        ListNode prev = this.head;
        int count = 0;
        while(count < index - 1) {
            prev = prev.next;
            count++;
        }
        return prev;
    }
    public boolean addIndex(int index, int data) {
        if(index < 0||index > getLength()) {
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
        while (cur != null) {
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
    private ListNode searchPrev (int key) {
        ListNode prev = this.head;
        while(prev.next != null) {
            if(prev.next.data ==key) {
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
        ListNode prev = searchPrev (key){
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
                }else {
                    prev = cur;
                    cur = cur.next;
                }
            }
            if(this.head.data == key) {
                this.head = this.head.next;
            }
        }
    }
    public void clear() {
        while(this.head.next != null) {
            ListNode cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }

}
