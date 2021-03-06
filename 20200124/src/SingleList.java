import java.util.List;
//不带头节点的单链表
class ListNode {
    public int data;
    public ListNode next;
    public ListNode (int data) {
        this.data = data;
        this.next = null;
    }
}
class SingleList {
    public ListNode head;  //标志头

    public SingleList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }

    }
    //尾插法
    public void addLast ( int data){
        //判断是否第一次插入
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (this.head == null) {
            this.head = node;
        }else {

            //找尾巴
            while(cur.next != null) {
                cur = cur.next;
            }
            //进行插入
            cur.next = node;
        }
    }
    //打印单链表数据
    public void display(){

        if(this.head == null)  {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.println(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //查找某数值
    private ListNode searchIndex(int index) {
        //prey-->index-1;
        ListNode prev = this.head;
        int count = 0;
        while(count < index-1) {
            prev = prev.next;
            count++;
        }
        return prev;
    }
    //插入到index位置
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        //下标不合法
        if(index<0||index>getLength()) {
            return false;
        }
        //头插法
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
    //求单链表长度
    public int getLength() {
        int count = 0;
        ListNode cur = this.head;
        while(cur!= null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
                //return cur;
            }
            cur = cur.next;
        }
        return  false;
        //return null;
    }
    public ListNode contains2(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //找前驱
    private  ListNode searchPrev(int key) {

        ListNode prev = this.head;
        while(prev.next != null) {
            if(prev.next.data==key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;

    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //删除的结点是头节点
        //找到删除的前驱，如果找不到，返回null


        if(this.head.data == key){
            this.head = this.head.next;
            return;
        }
        ListNode prev = searchPrev(key);
        if(prev == null) {
            System.out.println("没有你要删除的节点");
            return;
        }
        ListNode del = prev.next;
        //进行删除
        prev.next = del.next;
    }
    //删除所有值为key的节点
    //只遍历单列表一遍
    public void removeAllKey(int key) {
        ListNode cur = this.head.next;
        ListNode prev = this.head;
        while (cur != null) {
            if (prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }

        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }
    //清屏
    public void clear(){
        //this.head = null;
        while (this.head.next != null) {
            ListNode cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }
    //反转单链表
    public  ListNode reverseList () {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;
        while (cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
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
    //打印单链表
    public void display2(ListNode newHead){
        if(newHead == null) {
            return;
        }
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //返回中间结点
    public  ListNode middleNode1() {
        int len = getLength()/2;
        ListNode cur = this.head;
        for (int i = 0;i < len;i++) {
            cur = cur.next;
        }
        return cur;
    }
    public ListNode middleNode2() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    // 输入一个链表，输出该链表中倒数第k个结点。
    public ListNode findKthToTail(int k){
        if(k <=0 ||k > getLength()) {
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(k-1>0) {
            fast = fast.next;
            k--;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
    public ListNode findKthToTail2(int k){
        if(k <=0||head == null ) {
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(k-1>0) {
            if(fast.next != null){
                fast = fast.next;
                k--;
            }else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
    //以x为基准分割链表，前一半小于x，原顺序不变
    public ListNode partition(int x) {
        ListNode cur = this.head;
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        while(cur != null) {
            if(cur.data < x) {
                //判断是不是第一次插入
                if(bs == null) {
                    bs = cur;
                    be = bs;
                }else {
                    be.next = cur;
                    be = be.next;//be = cur;
                }
            }else {
                //判断是不是第一次插入
                if(as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;//ae = cur;
                }
            }
            cur = cur.next;
        }
        if(bs == null){
            return as;
        }
        be.next = as;
        if(as != null) {
            ae.next = null;
        }
        return bs;
    }
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public ListNode deleteDuplication() {
        if(this.head == null) {
            return null;
        }
        ListNode cur = this.head;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while(cur != null) {
            //重复节点
            if(cur.next != null
                    && cur.data == cur.next.data){
                while(cur.next != null
                        && cur.data == cur.next.data) {
                    cur = cur.next;
                }
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        //最后一个节点如果也是重复的
        // 需要将tmp.next = null;
        tmp.next = null;
        return newHead.next;
    }
    // 链表的回文结构。
    public boolean chkPalindrome(){
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }
        //找到单链表的中间节点
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转单链表
        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //fast/slow/往前   head往后
        while(slow != this.head){
            if(this.head.data!=slow.data) {
                return false;
            }
            if(this.head.next == slow) {
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }
    // 给定一个链表，判断链表中是否有环。
    public void creteLoop(){
        ListNode cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = this.head.next.next;
    }
    public boolean hasCycle(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast .next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return false;
        }
        return true;
    }
    //判断环入口
    public ListNode detectCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast .next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return  null;
        }
        slow = this.head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return  slow;
    }
    //输入两个链表，找出它们的第一个公共结点
}
