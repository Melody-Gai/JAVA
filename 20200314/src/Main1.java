import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        int[] array = new int[1000];
        for (int i = 0; N / 10 != 0; i++) {
            array[i] = (int)(N % 10);
            N /= 10;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
               if(array[i] > array[j]) {
                   int tmp = array[i];
                   array[i] = array[j];
                   array[j] = tmp;
               }
            }
        }
        int count = 0;
        for (int i = 0; i < array.length + 1; i++) {
            if(array[i] != array[i + 1]) {
                System.out.println(array[i] + ":" + count + 1);
                count = 0;
            }else {
                count++;
            }
        }
    }
}
