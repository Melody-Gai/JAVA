import java.util.*;
//错误
public class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            int [] arr1 = new int[n];
            for(int i = 0;i < n;i++) {
                arr[i] = sc.nextInt();
            }
            int k = 0;
            for(int i = 0;i < n;i++) {
                int flg = 0;
                for(int j = i + 1; j < n; j++) {
                    if(arr[i] == arr[j]) {
                        flg = 1;
                    }
                }
                if(flg == 0) {
                    arr1[k++] = arr[i];
                }
            }
            System.out.print((arr1[0] < arr1[1] ? arr1[0] : arr1[1]) + " " + (arr1[0] > arr1[1] ? arr1[0] : arr1[1]));
        }

    }
}