public class TestDemo {


    //不处理异常
    public static void main4(String[] args) {
        int []arr = {1,2,3};
        System.out.println("before");
        System.out.println(arr[100]);
        System.out.println("after");
    }

    public int num = 10;
    public static void main3(String[] args) {
        TestDemo t = null;
        System.out.println(t.num);//NullPointerException
    }
    public static void main2(String[] args) {
        int[]arr = {1,2,3};
        System.out.println(arr[100]);//ArrayIndexOutOfBoundsException
    }
    public static void main1(String[] args) {
        System.out.println(10/0);//ArithmeticException
    }
}
