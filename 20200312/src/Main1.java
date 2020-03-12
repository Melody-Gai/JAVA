import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[100000];
        int i = 0;
        for (i = 0;(n % 10) == 0 ; i++) {
            array[i] = 0;
            n /= 10;
        }
        int j = i;
        for (j = i; n / 10 != 0; j++) {
            array[j] = n % 10;
            n /= 10;
        }
        array[j] = n;
        for (int k = 0; k <= j; k++) {
            System.out.print(array[k]);
        }
    }
}
