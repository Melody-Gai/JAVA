import java.util.Scanner;

/**
 * @program: 20200810
 * @description：判断二进制数中有几个1
 * @author: GAI
 * @create: 2020-08-16 11:19
 **/
public class TestDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //  0000 1111
        //& 0000 0001
        //  0000 0001    不为0  count++

        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(((n>>i) & 1) == 1) {
                count++;
            }
        }
        System.out.println("count: " + count);
    }

}
