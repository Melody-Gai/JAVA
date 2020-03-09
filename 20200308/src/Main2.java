import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            System.out.println(count(n));
        }
    }
    public static int count(int n) {
        if(n % 2 != 0 || n == 10 || n < 6) {
            return -1;
        }
        if(n % 8 == 0) {
            return n / 8;
        }
        return 1 + n / 8;
    }
}
