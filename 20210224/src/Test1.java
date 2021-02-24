

/**
 * @program: 20210224
 * @description：无头双向链表
 * @author: GAI
 * @create: 2021-02-24 16:54
 **/
public class Test1 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.display();
        myLinkedList.addLast(99);
        myLinkedList.display();
       // myLinkedList.addIndex(2,199);
      /* myLinkedList.remove(2);
        myLinkedList.display();*/
       /* System.out.println(myLinkedList.contains(3));
        System.out.println(myLinkedList.size());*/
    }
}
