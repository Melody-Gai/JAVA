public class Test_Demo {
    public static void eveAfterOdd(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while(i < j) {
            while(i <j && array[i] % 2 != 0) {
                i++;
            }
            while(i < j && array[j] % 2 == 0) {
                j --;
            }
            if(i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }
}
