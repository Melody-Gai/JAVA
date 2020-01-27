import java.util.LinkedList;

class ListNode {
    public int data;
    public ListNode next;
    public ListNode prev;
    public ListNode(int data) {
        this.data = data;
    }
}
public class DoubleList {
    public ListNode head;
    public ListNode last;
    //头插法
    public void addFirst (int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }
    private ListNode searchIndex(int index){
        if(index < 0 || index >= size()) {
            return null;
        }
        ListNode cur = this.head;
        while(index > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if(index == 0) {
            addFirst(data);
            return true;
        }
        if(index == size()) {
            addLast(data);
            return true;
        }

        ListNode node = new ListNode(data);
        ListNode cur = searchIndex(index);
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
        return false;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex1(int index,int data){
        if(index == 0) {
            addFirst(data);
            return ;
        }
        if(index == size()) {
            addLast(data);
            return ;
        }
        //中间插入
        ListNode node = new ListNode(data);
        ListNode cur = searchIndex(index);
        if(cur == null) {
            return ;
        }
        node.next =  cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = this.head;
        while(cur != null){
            if(cur.data == key){
                if(this.head == cur) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur = this.head;
        while(cur != null) {
            if (cur.data == key) {
                if (this.head == cur) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void display(){
        ListNode cur = this.head;
        while(cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear(){
        while(this.head != null) {
            ListNode cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.last = null;
    }
}