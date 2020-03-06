import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean flg = true;
        for (int i = 0; i <= n / 6; i++) {
           int k = n - 6 * i;
           if(k % 8 == 0) {
               flg = false;
               System.out.println(i + k / 8);
               break;
           }
        }
        if(flg) {
            System.out.println("-1");
        }
    }
}