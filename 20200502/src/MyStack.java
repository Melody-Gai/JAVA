import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    public Queue<Integer> queue1 = new LinkedList<>();
    public Queue<Integer> queue2 = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (!queue1.isEmpty()) {
            queue1.offer(x);
        }else if(!queue2.isEmpty()){
            queue2.offer(x);
        }else {
            queue1.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        if (!queue1.isEmpty()) {
            int size1 = queue1.size() - 1;
            for (int i = 0;i < size1;i++) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
        if (!queue2.isEmpty()) {
            int size2 = queue2.size() - 1;
            for (int i = 0;i < size2;i++) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
        return -1;
    }

    /** Get the top element. */
    public int top() {
        if(!queue1.isEmpty()) {
            int tmp = 0;
            int size1 = queue1.size();
            for (int i = 0; i < size1; i++) {
                tmp = queue1.poll();
                queue2.offer(tmp);
            }
            return tmp;
        }
        if(!queue2.isEmpty()){
            int tmp2 = 0;
            int size2 = queue2.size();
            for (int i = 0; i < size2; i++) {
                tmp2 = queue2.poll();
                queue1.offer(tmp2);
            }
            return tmp2;
        }
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }
}
/*class MyStack {
    private Queue<Integer> a;//输入队列
    private Queue<Integer> b;//输出队列

    public MyStack() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void push(int x) {
        a.offer(x);
        // 将b队列中元素全部转给a队列
        while(!b.isEmpty())
            a.offer(b.poll());
        // 交换a和b,使得a队列没有在push()的时候始终为空队列
        Queue temp = a;
        a = b;
        b = temp;
    }

    public int pop() {
        return b.poll();
    }

    public int top() {
        return b.peek();
    }

    public boolean empty() {
        return b.isEmpty();
    }
*/