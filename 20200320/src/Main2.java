import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n > 1000) {
                n = 999;
            }
            int[] arr = new int[n * 3];
            for (int i = 0; i < 3 * n; i = i + n) {
                for(int j = 0;j < n;j++) {
                    arr[i] = j;
                }
            }
            int count = 1;
            for (int i = 2; i < 3 * n; i = i + 2) {
                count++;
                if(count == n) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}