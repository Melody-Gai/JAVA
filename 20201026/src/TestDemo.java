/**
 * @program: 20201026
 * @description：
 *          单链表：
 * @author: GAI
 * @create: 2020-10-26 17:06
 **/
public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(30);
        myLinkedList.addFirst(8);
        myLinkedList.addList(4);
        myLinkedList.addList(15);

        myLinkedList.display();

        myLinkedList.remove(8);

        myLinkedList.display();


        /*boolean flg = myLinkedList.contains(8);
        System.out.println(flg);

        System.out.println(myLinkedList.size());*/

        /*myLinkedList.addIndex(5,99);
        myLinkedList.display();*/

    }
}
