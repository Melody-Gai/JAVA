public class TestClass {
    private static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        ((TestClass)null).testMethod();

        int i=0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));

    }

}