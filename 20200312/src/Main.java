import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1;
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            sum *= i;
        }
        System.out.println(sum);
        for (int i = 0;(sum % 10) == 0 ; i++) {
            sum /= 10;
            count++;
        }
        System.out.println(count);
    }
}
