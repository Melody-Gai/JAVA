import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Main main = new Main();
        int ret = Main.Fibonacci(N);
        System.out.println(ret);
    }
    public static int Fibonacci(int x) {
        int[] F = new int[x];
         F[0] = 0;
         F[1] = 1;
        for (int i = 2; i < x; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        for (int i = 0; i < F.length; i++) {
            if(x > F[i] && x < F[i + 1]) {
                return (x - F[i]) < (F[i + 1] - x) ? (x - F[i]) : (F[i + 1] - x);
            }
        }
        return 0;
    }
}
