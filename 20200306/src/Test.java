import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean flg = true;
        for (int i = 0; i <= n / 6; i++) {
            for (int j = 0; j <= n / 8; j++) {
                if(6 * i + 8 * j == n) {
                    flg = false;
                    System.out.println(i + j);
                }
            }
        }
        if(flg) {
            System.out.println("-1");
        }
    }
}