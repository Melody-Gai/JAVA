import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[] num = {0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < a.length(); i++) {
            num[(int)(a.charAt(i) - '0')]++;
        }
        for (int i = 0; i < 10; i++) {
            if(num[i] != 0) {
                System.out.println(i + ":" + num[i]);
            }
        }
    }
}
