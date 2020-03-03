import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        int count = 0;
        char[] c = new char [a.length + b.length];

        for (int i = 0; i < a.length - 1; i++) {
            int j = 0;
            boolean flg = true;
            for (j = 0; j < i; j++) {
                c[j] = a[j];
            }
            for(int k = 0;k < b.length - 1;k++) {
                c[j] = b[k];
                j++;
            }
            for (int k = i; k < a.length - 1; k++) {
                c[j] = a[k];
                j++;
            }
            for (j = 0; j < c.length / 2; j++) {
                if(c[j] != c[c.length - 1 - j]) {
                    flg = false;
                }
            }
            while(flg == true) {
                count++;
            }
        }
        System.out.println(count);
    }

}

/*import java.util.*;
import java.util.Stack;

public class Main {
    public int findKth(int[] a, int n, int K) {
        quick(a,0, n - 1,K);
        return 0;
    }

    public static void quick(int[] a,int low,int high,int K) {
        int pivot = partion(a,low,high,K);

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
            pivot = partion(a,low,high,K);
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
    public static int partion(int[] array,int start,int end,int K) {
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
        return array[K - 1];
    }
}*/