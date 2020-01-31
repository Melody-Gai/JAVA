import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TestDemo {

  /*  public static void main(String[] args) {
        int maxValue
    }*/

    public static void main3(String[] args) {
        String name = "zhangshan";
        System.out.println(name);
        String str = "result = ";
        String a = "hello";
        String b = "world";
        String c = str + a + " " + b;
        System.out.println(c);
        int d = 10;
        int e = 20;
        System.out.println("a = " + d + "b = " + e);
    }

    public static void main2(String[] args) {
        long num = 10L;
        double n = 1.1;
        float m = 1.0f;
        char ch = '盖';
        byte value = 0;
        System.out.println(value);
        System.out.println(ch);
        System.out.println(m);
        System.out.println(n);
        System.out.println(n * n);
        System.out.println(num);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }

    public static void main1(String[] args) {
        int num = 10;
        System.out.println(num);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue + 1);
        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue - 1);
    }
}



/*
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        int age = 2;
        String name = "小明";
        Dog dog = new Dog(name, age);
        int x = age - 1;
        if (x > 1) {
            dog.play();
        } else {
            dog.bark();
        }
        int[] numList = new int[]{1, 3, 5, 7, 9};
        new Thread(() -> System.out.println("hello world")).start();
        try {
            InputStream in = new FileInputStream(new File("//xx.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 10);
        ((List) list).stream()
                .filter(e -> e % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }
}
    Class Dog {
        private String name;
        private Integer age;
        Public Dog(String name,Integer age) {
            this.name = name;
            this.age = age;
        }
        public void play() {
            System.out.println(this.name +"what to play");
        }
        public void bark() {
            System.out.println(this.name + "wangwangwang");
        }
    }
*/