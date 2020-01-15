import java.util.Random;
import java.util.Scanner;

public class TestDemo {

    //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本
    //身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
    public static void main(String[] args) {

        for (int i = 100; i <= 999 ; i++) {
            int a= i % 100;
            int b = i / 10 % 10;
            int c= i / 100;
            if(i == a*a*a + b*b*b + c*c*c) {
                System.out.println(i);
            }
        }
    }

    public static void main10(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9。
        int flg = 0;
        for(int i = 1; i <= 100;i++) {
            int a = i % 10;
            int b = i / 10;
            if(a == 9 && b == 9) {
                flg += 2;
            }else if((a == 9 && b != 9) || (a != 9 && b == 9)){
                flg++;
            }
        }
        System.out.println(flg);
    }

    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
    public static void main9(String[] args) {
        double sum = 0;
        for(int i = 1;i <= 100;i++) {
            if(i % 2 != 0) {
                double tmp = 1.0 / i;
                sum += tmp;
            }
            if(i % 2 == 0) {
                double tmp = - (1.0 / i);
                sum += tmp;
            }
        }
        System.out.println(sum);
    }

    public static void main8(String[] args) {
        //求两个正整数的最大公约数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        TestDemo mu = new TestDemo();
        mu.multiple(m,n);
        mu.divisor(m,n);
        scanner.close();
    }
    public void multiple(int m,int n) {
        for(int i = Math.max(m,n); ; i++) {
            if(i % m == 0 && i % n == 0) {
                System.out.println(m + "和" + n + "的最小公倍数为：" + i);
                break;
            }
        }
    }
    public void divisor(int m,int n) {
        for(int i = Math.min(m,n);i > 0;i--) {
            if(m % i ==0 && n % i ==0) {
                System.out.println(m + "和" + n + "的最大公约数是：" + i);
                break;
            }
        }
    }

    public static void main7(String[] args) {
        //输出乘法口诀
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j);
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void main6(String[] args) {
        //输出乘法口诀
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j);
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void main5(String[] args) {

        int sumOdd = 0;
        for(int i = 1;i <= 100;i++) {
            if(i %3 != 0) {
                continue;
                //System.out.println("i = "+ i);
                //break;
                //System.out.println("Hello");
            }
        }
        for(int i = 1;i <= 100;i += 2) {
            sumOdd += i;
        }
        System.out.println("sumOdd = "+ sumOdd);
    }

    public static void main4(String[] args) {

        int ret = 1;
        int sumOdd = 0;
        for(int i = 1;i <= 5;i++) {
            for(int j = 1;j <= i;j++) {

                ret *= j;
            }

            sumOdd += ret;
            ret = 1;
        }
        System.out.println("sumOdd = "+ sumOdd);
    }

    //打印年龄
    public static void main3(String[] args) {
        int num = 5;
        int i = 1;
        int ret = 1;
        int sum = 0;
        while(i < num) {
            ret = 1;
            int j = 1;
            while(j <= i) {
                ret *= j;
                j++;
            }
            sum += ret;
            i++;
        }
        System.out.println("sum = " + sum);
    }

    //猜数字
    public static void main1(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100);
        while (true) {
            System.out.println("请输入要输入的数字：");
            int num = sc.nextInt();
            if (num < toGuess) {
                System.out.println("低了");
            } else if (num > toGuess) {
                System.out.println("高了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
        sc.close();
    }

    public static void main2(String[] args) {
        int []array = {10,20};
        System.out.println("x= " + array[0]);
        System.out.println("x= " + array[1]);
        swap(array);
        System.out.println("x= " + array[0]);
        System.out.println("x= " + array[1]);
    }
    public static void swap(int [] array) {
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
}
