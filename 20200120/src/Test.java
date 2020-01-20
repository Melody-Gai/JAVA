import java.sql.Array;
import java.util.Arrays;

public class Test {

    /*public static void main1(String[] args) {
        int[] array = {1,2,3,5,4};
        int temp = array[0];
        for(int i = 0;i < array.length;i++) {
            if(array[i] > temp) {
                temp = array[i];
            }
        }
        System.out.println(temp);
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,5,4};
        int temp = array[0];
        for(int i = 0;i < array.length;i++) {
            if(array[i] < temp) {
                temp = array[i];
            }
        }
        System.out.println(temp);
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,5,4};
        int sum = 0;
        for(int i = 0;i < array.length;i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,5,4};
        for(int i = array.length-1;i >= 0 ;i--) {
            System.out.println(array[i]);
        }

    }
    public static void main5(String[] args) {
        int[] array = {1,2,3,5,4};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    public static void reverse(int[] array) {
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
    public static void main6(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(binarySearch(array,6));
    }
    public static  int binarySearch(int[] array,int toFind) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(toFind < array[mid]) {
                right = mid - 1;
            }else if(toFind > array[mid]) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main7(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(binarySearch(array,6,0, array.length-1));
    }

    public static int binarySearch(int[] array,int key,int left,int right) {
        if(left > right){
            return -1;
        }
        int mid = (left + right)>>1;
        if(array[mid] == key) {
            return mid;
        }else if(array[mid] > key) {
            return binarySearch(array,key,left,mid-1);
        }else {
            return binarySearch(array,key,mid+1,right);
        }
    }
    public static void main8(String[] args) {
        int[] array = {1,9,8,3,5,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array) {
        for(int i = 0;i < array.length-1;i++) {
            boolean flag = true;
            for(int j = 0;j < array.length-1-i;j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = false;
                }
            }
            if(flag == true) {
                break;
            }
        }
    }*/
    public static void main(String[] args) {
        int[][] array = {{1,9,8},{3,5,6}};
        //int[][] array5 = {{1,9},{3,5,6}};
        for(int i = 0;i < 2;i++) {

        }
        System.out.println(Arrays.toString(array));
    }
}
