import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        int col = (n + 1) / 2;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == col - 1 || j == n - 1) {
                    System.out.print(c);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
