import java.util.Scanner;

/**
 * @program: 20200810
 * @description：
 * @author: GAI
 * @create: 2020-08-20 17:07
 **/
public class TestDemo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 31; i >=1 ; i -= 2) {
            System.out.println(((n >> i) & 1 )+ " ");
        }

        System.out.println();

        for (int i = 30; i >=1 ; i -= 2) {
            System.out.println(((n >> i) & 1 )+ " ");
        }
    }

}
