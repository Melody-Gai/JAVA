import java.util.Arrays;

/**
 * @program: 20200830
 * @description：
 * @author: GAI
 * @create: 2020-08-30 16:57
 **/
public class Test {
    public static void main(String[] args) {
        int array[][] = new int[][] {{1,2,3},{4,5,6}};

        for (int[] tmp:array) {
            for (int x:tmp) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        /*System.out.println(Arrays.deepToString(array));*/

        /*for (int i = 0;i < array.length; i++) {
            for(int j = 0; j< array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
