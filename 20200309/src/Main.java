import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        float A,B,C;
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            A = (a + c) / 2f;
            B = (c - a) / 2f;
            C = (d - b) / 2f;
            if((A - (c + a) / 2) != 0){
                System.out.println("No");
                return;
            }
            if((B - (c - a) / 2) != 0 || (B != (b + d) / 2)){
                System.out.println("No");
                return;
            }
            if((C - (d - b) / 2) != 0){
                System.out.println("No");
                return;
            }
            System.out.println((int)A + " " + (int)B + " " + (int)C);
        }

    }
}
