public class Synchronized语法演示 {

    synchronized void 普通方法() {
        //争夺的是this指向对象中的锁
    }

    synchronized static void 静态方法() {
        //争夺的是Synchronized语法演示.class指向的对象中的锁
        //反射用法：class本身也有一个对象，可以通过类名.class引用找到这个对象
    }

    void 其他方法() {
        Object 一个引用 = new Object();
        synchronized (一个引用) {
            //争夺的是一个引用指向的对象中的锁
        }
    }
}
