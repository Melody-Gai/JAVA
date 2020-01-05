import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class TestSortDemo {

    public static void adjustDown(int[] array,int root,int len) {
        //log2n
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            if(child+1 < len && array[child] < array[child+1]) {
                child++;
            }
            //child保存的是最大值的下标
            if(array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }

    }

    public static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >= 0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }

    /*！！！堆排序 时间复杂度,建堆的时间复杂度为n*log2n,
    空间复杂度为O(1)，
    一次调整的时间复杂度：log2n
    不稳定的排序*/
    public static void heapSort(int[] array) {
        createHeap(array);
        int end = array.length-1;//9
        while (end > 0) {
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            adjustDown(array,0,end);//9
            end--;//8
        }
    }

    /*直接插入排序
    时间复杂度：最好：O(n）在其有序的情况下  数据越有序越快
    最坏：O(n^2）
    空间复杂度：O（1)
    稳定的排序
    * */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = 0;
            for (j = i - 1; j >= 0; j--) {
                if(array[j] > tmp) {   //array[j] >= tmp时不稳定排序
                    array[j + 1] = array[j];
                }
                else {
                    break;//前面的序列已经有序
                }
            }
            array[j + 1] = tmp;
        }
    }
    /*希尔排序
    * 时间复杂度：O（n^1.3-1.5）
    * 空间复杂度O（1）
    * 稳定性：不稳定排序*/
    public static void shell(int[] array,int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = 0;
            for (j = i-gap; j >= 0 ; j -= gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }

    /*选择排序
    * 时间复杂度：O(n^2)
    * 稳定性：不稳定排序
    * 空间复杂度O（1）*/

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        /*Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }*/

        System.out.println(Arrays.toString(array));
        long time1 = System.currentTimeMillis();
        selectSort(array);
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        System.out.println(Arrays.toString(array));
    }

    public static void main1(String[] args) {
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

}
