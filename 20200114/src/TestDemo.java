import java.util.Random;
import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100);
        //System.out.println("toGuess: " + toGuess);
        while(true) {
            System.out.println("请输入要输入的数字：（1-100）");
            int num = sc.nextInt();
            if(num < toGuess) {
                System.out.println("低了");
            }else if(num > toGuess) {
                System.out.println("高了");
            }else {
                System.out.println("bingo!");
                break;
            }
        }
        sc.close();
    }

    public static void main13(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int num = 0;
        while(sc.hasNextDouble()) {
            double tmp = sc.nextDouble();
            sum += tmp;
            num++;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum / num);
        sc.close();
    }

    public static void main12(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的工资：");
        float salary = sc.nextFloat();
        System.out.println("你的信息如下：");
        System.out.println("姓名：" + name + "\n" + "年龄：" + age + "\n" + "工资：" +salary);
        sc.close();
    }

    public static void main11(String[] args) {
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num <= 10);
    }

    public static void main10(String[] args) {
        int num = 100;
        while(num <= 200) {
            if(num % 3 != 0) {
                num++;
                continue;
            }
            System.out.println("找到了3的倍数，为：" + num);
            num ++;
        }
    }

    public static void main9(String[] args) {
        int num = 100;
        while(num <= 200) {
            if(num % 3 ==0) {
                System.out.println("找到了3的倍数，为：" + num);
                break;
            }
            num++;
        }
    }

    public static void main8(String[] args) {
        int n = 1;
        int result = 1;
        while(n <= 5) {
            result *= n;
            n++;
        }
        System.out.println(result);
    }

    public static void main7(String[] args) {
        int num = 1;
        int sum = 0;
        while(num <= 5) {
            int factorResult = 1;
            int tmp = 1;
            while(tmp <= num) {
                factorResult *= tmp;
                tmp++;
            }
            sum += factorResult;
            num++;
        }
        System.out.println("sum = " + sum);
    }

    public static void main6(String[] args) {
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
    }

    public static void main5(String[] args) {
        int n = 1;
        int result = 0;
        while(n <= 100) {
            result += n;
            n++;
        }
        System.out.println(result);
    }

    public static void main4(String[] args) {
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Firday");
                break;
            case 6:
                System.out.println("Starday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

//判断是否闰年
    public static void main3(String[] args) {
        int year = 2000;
        if(year % 100 == 0) {
            //判断世纪闰年
            if(year % 400 == 0) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }else{
            //普通闰年
            if(year % 4 == 0) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }

    }

    //判断正负
    public static void main2(String[] args) {
        int num = 10;
        if(num > 0) {
            System.out.println("num is a zhengshu");
        }else if(num < 0){
            System.out.println("num is a fushu");
        }else{
            System.out.println("num is 0");
        }
    }
    //判断奇偶
    public static void main1(String[] args) {
        int num = 10;
        if(num % 2 == 0) {
            System.out.println("num is a oushu");
        }else {
            System.out.println("num is a jishu");
        }
    }
}
