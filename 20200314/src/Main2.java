import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int[] array = new int[N.length()];
        int[] M = {0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < N.length(); i++) {
            array[i] = N.charAt(i);
        }
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case'0':
                    M[0]++;
                    break;
                case'1':
                    M[1]++;
                    break;
                case'2':
                    M[2]++;
                    break;
                case'3':
                    M[3]++;
                    break;
                case'4':
                    M[4]++;
                    break;
                case'5':
                    M[5]++;
                    break;
                case'6':
                    M[6]++;
                    break;
                case'7':
                    M[7]++;
                    break;
                case'8':
                    M[8]++;
                    break;
                case'9':
                    M[9]++;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if(M[i] != 0) {
                System.out.println(i + ':' + M[i]);
            }
        }
    }
}
