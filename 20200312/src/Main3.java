import java.util.*;

import static java.lang.Math.abs;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int f1 = 0;
        int f2 = 1;
        while(f2 <= n) {
            int f2_tmp = f2 + f1;
            f1 = f2;
            f2 = f2_tmp;
        }
        System.out.print((f2 - n) > (n - f1) ? n - f1 : f2 - n);
    }
}