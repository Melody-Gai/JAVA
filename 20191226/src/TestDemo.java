import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;


public class TestDemo {

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
    public static void main1(String[] args) {
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

    //归并排序：   分治思想   递归
    //稳定排序
    //时间复杂度n*log2n
    //空间复杂度O(n)

    public static void merge(int[] array,int low,int mid,int high) {
        int s1 = low;
        int s2 = mid + 1;
        int[] tmpArray = new int[high - low + 1];
        int i = 0; //tmpArray的数组下标
        //当两个归并段都有数据的时候
        while (s1 <= mid && s2 <= high) {
            //如果时小于就不稳定了
            if(array[s1] <= array[s2]) {
                tmpArray[i++] = array[s1++];
            }else {
                tmpArray[i++] = array[s2++];
            }
        }
        while (s1 <= mid) {
            tmpArray[i++] = array[s1++];
        }
        while (s2 <= high) {
            tmpArray[i++] = array[s2++];
        }
        //tmpArray里面存放的时有序数据，将其有序数据放回到array里面
        for (int j = 0; j < tmpArray.length; j++) {
            array[low + j] = tmpArray[j];
        }
    }
    public static void mergeSortInternal(int[] array,int low,int high) {
        if(low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid + 1,high);
        //进行合并
        merge(array,low,mid,high);
    }
    public static void mergeSort1(int[] array) {
        mergeSortInternal(array,0,array.length - 1);
    }
    //非递归
    public static void mergeSort(int[] array) {

        for (int i = 0; i < array.length; i *= 2) {
            merge1(array,i);
        }
    }
    //gap代表每个归并段的数据
    public static void merge1(int[] array,int gap) {
        int[] tmpArr = new int[array.length];
        int k = 0;//下标

        int s1 = 0;
        int e1 = s1 + gap - 1;
        int s2 = e1 + 1;
        int e2 = (s2 + gap - 1) < array.length ? (s2 + gap - 1) : array.length - 1;
        //两个归并段都有数据
        while(s2 < array.length) {
            while (s1 <= e1 && s2 <= e2) {
                if(array[s1] <= array[s2]) {
                    tmpArr[k++] = array[s1++];
                }else {
                    tmpArr[k++] = array[s2++];
                }
            }
            while(s1 <= e1) {
                tmpArr[k++] = array[s1++];
            }
            while(s2 <= e2) {
                tmpArr[k++] = array[s2++];
            }
            s1 = e2 + 1;
            e1 = s1 + gap - 1;
            s2 = e1 + 1;
            e2 = (s2 + gap - 1) < array.length ? (s2 + gap - 1) : array.length - 1;
        }

        //判断是不是还有一个归并段，并且这个归并段一定是s1那个段
        while (s1 <= array.length - 1) {
            tmpArr[k++] = array[s1++];
        }
        for (int i = 0; i < tmpArr.length; i++) {
            array[i] = tmpArr[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        System.out.println(Arrays.toString(array));
        mergeSort1(array);
        System.out.println(Arrays.toString(array));
    }
}
