import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class TestDemo {

    public static void main(String[] args) {
        int[] array = {1,6,3,5,8,9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array) {
        for(int i = 0;i < array.length - 1;i++) {
            boolean flg = true;
            for(int j = 0;j < array.length - 1;j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    flg = false;
                }
            }
            if(flg == true) {
                break;
            }
        }
    }

    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(binarySearch1(array,6,0,array.length - 1));
    }
    public static int binarySearch1(int[] array,int key,int left,int right) {
        if(left > right) {
            return -1;
        }
        int mid = (left + right)>>1;
        if(array[mid] == key) {
            return mid;
        }else if(array[mid] > key) {
            return binarySearch1(array,key,left,mid - 1);
        }else{
            return binarySearch1(array,key,mid - 1,right);
        }
    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(binarySearch(array,6));
    }
    public static int binarySearch(int[] array,int toFind) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(toFind < array[mid]) {
                right = mid - 1;
            }else if(toFind > array[mid]) {
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main3(String[] args) {
        int[] array = {1,2,3,5,4};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    public static void reverse (int[] array) {
        int i = 0;
        int j = array.length - 1;
        while(i < j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main2(String[] args) {
        int[] array = {1,2,3,5,4};
        int sum = 0;
        for(int i = 0;i < array.length;i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,5,4};
        int tmp = array[0];
        for(int i = 0;i < array.length;i++) {
            if(array[i] > tmp) {
                tmp = array[i];
            }
        }
        System.out.println(tmp);
    }
}
