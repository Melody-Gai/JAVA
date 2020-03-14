import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int[] array = new int[N.length()];
        for (int i = 0; i < N.length(); i++) {
            array[i] = N.charAt(i);
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
        int count = 1;
        int k = array[0];
        for (int i = 1; i < array.length; i++) {
            if(k == array[i]) {
                count++;
            }else {
                System.out.println(k + ":" + count);
                count = 0;
                k = array[i];
            }
        }

        /*for (int i = 0; i < array.length + 1; i++) {
            if(array[i] != array[i + 1]) {
                System.out.println(array[i] + ":" + count + 1);
                count = 0;
            }else {
                count++;
            }
        }*/
    }
}
