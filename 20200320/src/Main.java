import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            if (N == 0) {
                return;
            }
            int[] arr = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int T = sc.nextInt();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (T == arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}