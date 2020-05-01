import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestDemo {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("abc");
    }

    public static void main2(String[] args) {
        MyQueueList myQueueList = new MyQueueList();
        myQueueList.offer(1);
        myQueueList.offer(2);
        myQueueList.offer(3);
        myQueueList.offer(14);

        System.out.println(myQueueList.poll());
        System.out.println(myQueueList.peek());
    }

    public static void main1(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        System.out.println(myStack.pop());
        System.out.println(myStack.getTop());

        MyStack<String> myStack2 = new MyStack<>();
        myStack2.push("java");
        myStack2.push("fjid");
        myStack2.push("bit");
        myStack2.push("skjkf");

        System.out.println(myStack2.pop());
        System.out.println(myStack2.getTop());

        Stack<Integer> stack = new Stack<>();
    }
}
