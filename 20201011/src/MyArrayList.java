import java.util.Arrays;

/**
 * @program: 20201011
 * @description：
 * @author: GAI
 * @create: 2020-10-11 15:28
 **/
public class MyArrayList {

    public int[] elem;
    public int usedSize;
    public static final int capacity = 10;

    public MyArrayList() {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }

    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();

        //System.out.println(Arrays.toString(this.elem));
    }

    private boolean isFull() {

        /*if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;*/

        return this.usedSize == this.elem.length;
    }

    public void add(int pos,int data) {

        checkPos(pos);

        if (isFull()) {
            this.elem =
                    Arrays.copyOf(this.elem,2*this.elem.length);
            //二倍扩容
        }
        if(pos >= 0 && pos <= this.usedSize) {
            for (int i = this.usedSize - 1; i >= pos ; i--) {
                this.elem[i + 1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }
        else {
            System.out.println("插入位置不合理");
        }
    }

    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }

    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }

    public int size(){
        return this.usedSize;
    }

    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    public int getPos(int pos) {

        checkPos(pos);

        if (size() != 0) {
            if (pos >= 0 && pos <= this.usedSize - 1) {
                return this.elem[pos];
            }
        }
        //return -1;
        throw new RuntimeException("顺序表为空");
    }

    private void checkPos(int pos) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }

    public void remove(int toRemove) {
        int index = search(toRemove);
        if (index == -1) {
            System.out.println("没有要删除的元素");
            return;
        }
        for (int i = index; i < this.usedSize - 1;i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    //更新
    public void setPos(int pos,int value) {
        checkPos(pos);

        this.elem[pos] = value;
    }

}
