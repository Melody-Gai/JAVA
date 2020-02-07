import java.util.Arrays;

public class MyArrayList {
    public int[] elem;
    public int usedsize;
    private final int CAPACITY = 5;

    public MyArrayList() {
        this.elem = new int[CAPACITY];
        this.usedsize = 0;
    }

    public void display() {
        for(int i = 0;i < this.usedsize;i++) {
            System.out.println(this.elem[i] + " ");
        }
    }
    private  boolean isFull() {
        return this.usedsize == this.elem.length;
    }
    public void add(int pos,int data) {
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length * 2);
        }
        if(pos < 0 || pos > this.usedsize) {
            System.out.println("该位置不合法");
            return;
        }
        for(int i = this.usedsize - 1;i >= pos;i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedsize++;
    }
    public boolean contains(int toFind) {
        for(int i = 0;i < this.usedsize;i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    public int search(int toFind) {
        for (int i = 0; i < this.usedsize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos) {
        if(pos < 0 || pos >= this.usedsize) {
            System.out.println("pos位置不合法");
            return -1;
        }
        return this.elem[pos];
    }
    public void setPos(int pos,int value) {

    }
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("找不到要删除的数字");
            return;
        }
        for (int i = index; i < this.usedsize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedsize--;
    }
    public  int size() {
        return this.usedsize;
    }
    public void clear() {
        this.usedsize = 0;
    }

}
