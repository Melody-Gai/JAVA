import java.util.List;

//不带头节点的单链表
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
/*class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
    this.data = data;
    this.next = null;
    }
}*/

 class MySingleLest {
    public ListNode head;//标志头
    public  MySingleLest () {
        this.head = null;
    }
    /*class  MySingleList {
        public ListNode head;
        public MySingleLest() {
            this.head = null;
        }
    }
 }*/

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
    /*public void addFirst(int data) {
        ListNode node = new Listnode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
 }*/
     public void addlast (int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null) {
            this.head = node;
        }else {
            //找尾巴
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
     }
     /*public void addList(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head != null) {
            this.head = node;
        }else {
            while(cur.next!= null) {
                cur = cur.next;
                cur.next = node;
            }
        }
     }*/
     public void display (){
         if(this.head == null) {
             return ;
         }
         ListNode cur = this.head;
         while(cur != null) {
             System.out.println(cur.data+" ");
             cur = cur.next;
         }
         System.out.println();
     }
    /*public void diaplay() {
         if(this.head = null) {
             return;
         }
         ListNode node = this.head;
         while(cur !=null) {
             System.out.println(cur.data+" ");
             cur = cur.next;
         }
        System.out.println();
    }*/
    private ListNode searchIndex(int index) {
        ListNode prev = this.head;
        int count = 0;
        while(count <index-1) {
            prev = prev.next;
            count++;
        }
        return prev;
    }
    public boolean addIndex(int index,int data) {
        if(index<0||index>getLength()) {
            return false;
        }
        if(index==0) {
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
        while(cur!= null) {
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
                //return cur;
            }
            cur = cur.next;
        }
        return false;
        //return null;
    }
    public void removeAllKey(int key) {
        ListNode cur = this.head.next;
        ListNode prev = this.head;
        while (cur != null) {
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
    public void removeAllKey(int key) {
        ListNode cur = this.head.next;
        ListNode prev = this.head;
        while (cur != null) {
            if(prev.next.data == key) {
                prev.next= cur.next;
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

 }

