import java.util.Stack;

class MinStack {

    public Stack<Integer> stack = new Stack<>();
    public Stack<Integer> minStack = new Stack<>();


    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if(minStack.empty()) {
            minStack.push(x);
        }else {
            int tmp = minStack.peek();
            if(tmp >= x) {
                minStack.push(x);
            }
        }
    }

    public void pop() {
        int tmp = stack.pop();
        if(tmp == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if(minStack.empty()) {
            return -1;
        }
        return minStack.peek();
    }
}