import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = m * (m - 1) + 1;
        for (int i = 0; i < m - 1; i++) {
            System.out.print(n);
            System.out.print("+");
            n += 2;
        }
        System.out.println(n);
    }
}
