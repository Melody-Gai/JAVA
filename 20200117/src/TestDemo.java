import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class TestDemo {

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

    /*冒泡排序
     * 稳定性：稳定
     * 时间复杂度：O（n^2）
     * 空间复杂度为O（1）
     * */

    public static void bubbleSort(int[] array) {
        boolean flg = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]){    //现在是稳定的排序
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

    /*!!!!快速排序（递归非递归
     * 分治算法：分而治之
     * 最好的情况：将待排序列均匀的分割
     * 时间复杂度：O(n*log2n)    最坏：n^2
     * 空间复杂度：O(log2n)
     * 稳定性：不稳定排序
     *  优化思路1：在排序过程当中，数据会逐渐趋于有序，对于直接插入排序来说，数据越有序越快：O(n)--n--小
     *  在排序的过程当中，某个区间的数据很小的时候，阈值设定为100/1000/10000等
     *  优化2：三数取中法*/

    public static int partion(int[] array,int start,int end) {
        int tmp = array[start];
        while (start < end) {
            while ((start < end) && array[end] >= tmp) {
                end--;
            }
            if(start >= end) {
                break;
            }else {
                array[start] = array[end];
            }
            while ((start < end) && array[start] <= tmp) {
                start++;
            }
            if(start >= end) {
                break;
            }else {
                array[end] = array[start];
            }
        }
        array[start] = tmp;
        return start;
    }

    public static void insertSort2(int[] array,int low,int high) {
        for (int i = low+1; i <= high; i++) {
            int tmp = array[i];
            int j = 0;
            for (j = i-1; j >= low ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;//前面的序列已经有序
                }
            }
            //
            array[j+1] = tmp;
        }
    }

    public static void swap(int[] array,int low,int high) {
        int tmp = array[low];
        array[low] = array[high];
        array[high] = tmp;
    }


    public static void ThreeNumOfMiddle
            (int[] array,int low,int high) {
        //array[mid] <= array[low] <= array[high];
        int mid = (low+high)/2;
        //array[mid] <= array[high]
        if(array[mid] > array[high]) {
            swap(array,mid,high);
        }
        //array[mid] <= array[low]
        if(array[mid] > array[low]) {
            swap(array,mid,low);
        }
        //array[low] <= array[high]
        if(array[low] > array[high]) {
            swap(array,low,high);
        }
    }

    public static void quick(int[] array,int low,int high) {
        //if(low == high) {} 他两相遇有一个元素
        //if(low > high) {} 右边的情况
        if(low >= high) {
            return;
        }
        //优化方式一：
        if(high-low+1 < 100) {
            insertSort2(array,low,high);
            return;
        }

        ThreeNumOfMiddle(array,low,high);

        //1、写一个函数，将待排序序列分为两部分
        int pivot = partion(array,low,high);
        //2、开始递归，左   右
        quick(array,low,pivot-1);
        quick(array,pivot+1,high);
        /*if(low < high) {
            //1、写一个函数，将待排序序列分为两部分
            int pivot = partion(array,low,high);
            //2、开始递归，左   右
            quick(array,low,pivot-1);
            quick(array,pivot+1,high);
        }*/
    }

    /**
     * 时间复杂度：O(nlog2n)    最坏情况：O(n^2) 数据有序
     * 空间复杂度：O(log2n)
     * 稳定性：不稳定
     * @param array
     */
    public static void quickSort(int[] array) {
        quick2(array,0,array.length-1);
    }

    public static void quick2(int[] array,int low,int high) {
        int pivot = partion(array,low,high);

        Stack<Integer> stack = new Stack<>();
        if(pivot > low+1 ) {
            stack.push(low);
            stack.push(pivot-1);
        }
        if(pivot < high-1) {
            stack.push(pivot+1);
            stack.push(high);
        }
        while (!stack.empty()) {
            high = stack.pop();
            low = stack.pop();
            pivot = partion(array,low,high);
            if(pivot > low+1 ) {
                stack.push(low);
                stack.push(pivot-1);
            }
            if(pivot < high-1) {
                stack.push(pivot+1);
                stack.push(high);
            }
        }

    }
    public static void main8(String[] args) {
        int[] array = new int[10000000];
        /*for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }*/
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        //System.out.println(Arrays.toString(array));
        long time1 = System.currentTimeMillis();
        quickSort(array);
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        //System.out.println(Arrays.toString(array));
    }

    public static void main9(String[] args) {
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
