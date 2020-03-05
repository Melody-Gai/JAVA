import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class TestDemo {
    public static int count(int[] A, int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            int M = A[i];
            for (int j = 0; j < i; j++) {
                if(A[j] > M) {
                    M  = A[j];
                }
            }
            for (int j = i + 1; j < n; j++) {
                if(M > A[j]) {
                    k++;
                    break;
                }
            }
        }
        return k;
    }

}

/*import java.util.Scanner;
public class TestDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[100000];
        array[0] = in.nextInt();
        int count = 0;
        for (int i = 0; array[i] != 0 ;) {
            array[++i] = in.nextInt();
            count++;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(coco(array[i]));
        }
    }

    public static int coco(int n) {
        if (n < 3) {
            return 0;
        } else {
            return n / 3 + coco(n / 3);
        }
    }
}


import java.util.Scanner;
public class TestDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[100];
        array[0] = in.nextInt();
        for (int i = 0; array[i] != 0 && i < 10;) {
            int ret = coco(array[i]);
            System.out.println(ret);
            array[++i] = in.nextInt();
        }
    }

    public static int coco(int n) {
        if (n < 3) {
            return 0;
        } else {
            return n / 3 + coco(n / 3);
        }
    }
}*/
