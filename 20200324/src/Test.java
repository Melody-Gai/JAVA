import java.util.Arrays;

public class Test {

    public static void bubbleSort(int[] array) {
        boolean flg = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
            }
            if(!flg) {
                break;
            }
        }
    }

    public static int partion(int[] array,int start,int end) {

    }

    public static void quick(int[] array,int low,int high) {

        if(low == high) {
            return;
        }

        int privot = partion(array,low,high);

        quick(array,low,privot - 1);
        quick(array,privot + 1,high);
    }

    public static void quickSort(int[] array) {
        quick(array,0,array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {12,34,5,6,3,7,43,8};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
