//一个通用的顺序表——》泛型
/*
* MyArrayList:泛型类
* <T>：T只是一个占位符，标识当前类为泛型类
* 泛型的意义是什么？
* 1、可以进行自动类型检查
* 2、自动进行类型的转换
* 泛型 的坑：
* 1、泛型类型的参数不能是简单类型，一定要是包装类
*     面试的时候会问:泛型到底是怎么被编译的？
* ！！！擦除机制！！！：擦除为Object
* 2、不能new一个泛型类型的数组
* T[] elem = new T[10];
* 3、泛型类型的参数不参与类型的组成
* */

public class MyArrayList<T> {

    public T[] elem;
    public int usedSize;

    public MyArrayList() {
        //this.elem = new int[10];
        this.elem = (T[]) new Object[10];
        this.usedSize = 0;
    }

    public void add(T data) {
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    public T get() {
        T tmp = this.elem[this.usedSize - 1];
        return tmp;
        //return this.elem[this.usedSize - 1];
    }


}
