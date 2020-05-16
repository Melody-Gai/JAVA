public class Test3 {
    public void add(Byte b) {
        b = b++;
    }

    public void test() {

        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.test();
    }
}