import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            int n = cin.nextInt();
            int[] arr = new int [n+1];
            for (int i = 1; i <=n ; i++) {
                arr[i] = cin.nextInt();
            }
            int K = cin.nextInt();
            int d = cin.nextInt();
            long[][] fmax = new long[K+1][n+1];
            long[][] fmin = new long[K+1][n+1];
            long  res = Integer.MIN_VALUE;
            for (int i = 1; i <=n; i++) {
                fmax[1][i] = arr[i];
                fmin[1][i] = arr[i];
                for (int k = 2; k <=K; k++) {
                    for (int j = i-1 ; j > 0 &&  i-j<=d ; j--) {
                        fmax[k][i] = Math.max(fmax[k][i], Math.max(fmax[k-1][j] * arr[i], fmin[k-1][j] * arr[i]));
                        fmin[k][i] = Math.min(fmin[k][i], Math.min(fmax[k-1][j] * arr[i], fmin[k-1][j] * arr[i]));
                    }
                }
                res = Math.max(res ,fmax[K][i]);
            }
            System.out.println(res);
        }
    }
}
