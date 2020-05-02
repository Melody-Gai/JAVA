import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TestDemo {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }else {
                if(stack.empty()) {
                    System.out.println("右括号多");
                    return false;
                }
                char top = stack.peek();
                if (top == '(' && ch == ')' ||
                        top == '{' && ch == '}' ||
                        top == '[' && ch == ']') {
                    stack.pop();
                }else {
                    System.out.println("右括号匹配错误");
                    return false;
                }
            }
        }
        if (!stack.empty()) {
            System.out.println("左括号多！");
            return false;
        }
        return true;
    }

    public static void main3(String[] args) {
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
