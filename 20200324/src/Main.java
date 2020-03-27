import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int n = scan.nextInt();
            System.out.println(getTotalCount(n));
        }
    }
    public static int getTotalCount(int m) {
        int a = m / 3;
        return (int) Math.pow(2,a);
    }
}