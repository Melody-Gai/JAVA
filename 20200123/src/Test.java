/*class Person {
    public int age;   //成员属性  实例变量
    public String name;
    public String sex;

    public void eat() {   //成员方法
        System.out.println("吃饭！");
    }

    public void sleep() {
        System.out.println("睡觉！");
    }
}
*/
public class Test {

    /*public static void main(String[] args) {

        Person person = new Person();
        person.eat();
        person.sleep();
        Person person2 = new Person();
        Person person3 = new Person();
    }*/

    class MyArrayList {
        //属性
        private int[] elem;
        private int usedSize;
        private final int CAPACITY = 10;

        public MyArrayList() {
            this.elem = new int[CAPACITY];
            this.usedSize = 0;
        }
        //方法
        // 打印顺序表
        public void display() {
            for(int i = 0;i < this.usedSize;i++) {
                System.out.println(this.elem[i] +" ");
            }
        }
        // 在 pos 位置新增元素
        public void add(int pos, int data) {
            if(pos < 0 || pos > this.usedSize) {
                System.out.println("该位置不合法");
                return;
            }
        }
       /* *//*  if(isFull)*//*
        //1、挪数据
         for(int i = this.usedSize - 1; i >= pos;i --) {
            this.elem[i+1] = this.elem[i];
        }
        this,elem[pos] = data;
        this.usedSize++;
        // 判定是否包含某个元素
        public boolean contains(int toFind) {
            for(int i = 0;i < this.usedSize;i++)
                return true;
        }*/
        // 查找某个元素对应的位置
        public int search(int toFind) {

            return -1;
        }
        // 获取 pos 位置的元素
        public int getPos(int pos) {

            return -1;
        }
        // 给 pos 位置的元素设为 value
        public void setPos(int pos, int value) {

        }
        //删除第一次出现的关键字key
        public void remove(int toRemove) {

        }
        // 获取顺序表长度
        public int size() {

            return 0;
        }
        // 清空顺序表
        public void clear() {

        }


    }

}
