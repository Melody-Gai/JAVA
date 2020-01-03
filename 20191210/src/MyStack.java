public class MyStack<T> {

    public T[] elem;
    public int top;

    public MyStack() {
        this.elem = (T[]) new Object[10];
        this.top = 0;
    }

    public boolean isFull() {
        return this.top == this.elem.length;
    }
//入栈
    public void push(T val) {
        if(isFull()) {
            return;
        }
        this.elem[this.top] = val;
        this.top++;
    }

    private boolean isEmpty() {
        return this.top == 0;
    }
    //出栈
    public T pop() {
        if(isEmpty()) {
            return null;
        }
        T tmp = this.elem[top - 1];
        this.top--;
        return tmp;
    }
    //得到栈顶元素但是不出栈
    public T getTop() {
        if(isEmpty()) {
            return null;
        }
        return this.elem[top - 1];
    }
}
