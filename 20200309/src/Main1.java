import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            String[] strs = str.split(" ");
            int[] array = new int[strs.length];
            int k = array.length / 2;
            for(int i = 0;i < array.length;i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if(array[i] > array[j]) {
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
            }
            for(int i = 0;i < array.length;i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if(array[i] != array[j]) {
                        int sub = j - i;
                        i = j;
                        if(sub >= k) {
                            System.out.println(array[i]);
                        }
                    }
                }
            }
        }
    }
}
