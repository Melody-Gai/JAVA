public class TestDemo {
    // 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public static ListNode mergeTwoLists(ListNode headA, ListNode headB){
        ListNode node = new ListNode(-1);
        ListNode newHead = null;
        ListNode tmp = node;
        while(headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else{
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
    //输入两个链表，找出它们的第一个公共结点
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pL = headA;//永远指向长的单链表
        ListNode pS = headB;//永远指向短的单链表

        int lenA = 0;
        int lenB = 0;

        //求的lenA  lenB
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;
        //差值-》最长的单链表先走len步
        int len = lenA - lenB;
        if (len < 0) {
            pL = headB;
            pS = headA;
            len = lenB - lenA;
        }

        //让pL先走len步
        while (len > 0) {
            pL = pL.next;
            len--;
        }
        //开始一起走  (pL  != pS ) {一人一步走}
        while (pL != pS) {
            pS = pS.next;
            pL = pL.next;
        }
        if ( pL == null ){
            return null;
        }
        return pL;//return pS;
    }
    public static void createCut
            (ListNode headA, ListNode headB) {
        headA.next = headB.next.next;
    }

    //深拷贝  复制带随机指针的链表
    class Solution {
        public ListNode copyRandomList(ListNode head) {
            if(head == null){
                return null;
            }

            //1、老新进行进行交替链接
            ListNode cur = head;
            while(cur != null) {
                ListNode node = new ListNode(cur.val,cur.next,null);
                ListNode tmp = cur.next;
                cur.next = node;
                cur = tmp;
            }
            //2、修改random
            cur = head;
            while(cur != null) {
                if(cur.random != null) {
                    cur.next.random = cur.random.next;
                    cur = cur.next.next;
                }else{
                    cur = cur.next.next;
                }
            }
            //3、将老新节点 打开
            cur = head;
            ListNode newHead = cur.next;
            while(cur.next != null) {
                ListNode tmp = cur.next;
                cur.next = tmp.next;
                cur = tmp;
            }
            return newHead;
        }
    }
}

    public static void main(String[] args) {
        SingleList singleList = new SingleList();

        singleList.addLast(1);
        singleList.addLast(2);
        singleList.addLast(7);
        singleList.addLast(8);
        singleList.addLast(5);
        singleList.display();

        ListNode newHead = singleList.partition(6);
        singleList.display();


        /*singleList.display();
        singleList.addIndex(0,99);
        singleList.display();
        singleList.addIndex(7,999);
        singleList.display();

        singleList.clear();
        System.out.println("fakfalls");

        singleList.removeAllKey(2);
        singleList.display();
        singleList.remove(99);
        System.out.println("删除99");
        singleList.display();//199 1 2 3 4 5 999
        singleList.remove(999);
        System.out.println("删除999");
        singleList.display();//199 1 2 3 4 5
        singleList.remove(2);
        System.out.println("删除2");
        singleList.display();//199 1 3 4 5

       /* boolean flg = singleList.contains1(99);
        System.out.println(flg);

        ListNode node = singleList.contains2(500);
        System.out.println(node.data);//5节点的地址*/
    }
}

