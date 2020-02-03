
class BubbleSort{
    void printIntArray (int[] arr) {
        for (int x:arr) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
    void sort(int[] arr) {
        int tmp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    tmp = arr[i];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

public class Test {

    public static void bubbleSort(int[] array) {
        boolean flg = false;
        for (int i = 0; i < array.length - 1; i++) {
            flg = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
            }
            if(!flg) {
                return;
            }
        }
    }

    public static void reverse(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j++;
        }
    }

    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = (left + right)>>>1;
            if(array[mid] == key) {
                return mid;
            }
            else if(array[mid] < key) {
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static int binarySearch1 (int[] array,int key,int left,int right) {
        if(left > right) {
            return -1;
        }
        int mid = (left + right) >>> 1;
        if(array[mid] == key) {
            return mid;
        }else if(array[mid] > key) {
            return binarySearch1(array,key,left,mid - 1);
        }else {
            return binarySearch1(array,key,mid + 1,right);
        }
    }
}
