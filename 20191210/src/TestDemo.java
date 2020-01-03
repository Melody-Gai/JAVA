import java.util.Queue;

//1:50
public class TestDemo {

    public static void main(String[] args) {
        MyListQueue myListQueue = new MyListQueue();
        myListQueue.offer(1);
        myListQueue.offer(2);
        myListQueue.offer(3);
        myListQueue.offer(4);

        System.out.println(myListQueue.poll());
        System.out.println(myListQueue.peek());


    }

    public static void main1(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println(myStack.pop());
        System.out.println(myStack.getTop());

        MyStack<String> myStack2 = new MyStack<>();
        myStack2.push("java");
        myStack2.push("20");
        myStack2.push("gaigai");
        myStack2.push("hhh");

        System.out.println(myStack.pop());
        System.out.println(myStack.getTop());
    }
}
