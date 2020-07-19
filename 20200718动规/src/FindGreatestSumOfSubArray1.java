import static java.lang.Math.max;

public class FindGreatestSumOfSubArray1 {
    public static void main(String[] args) {

    }

    public  int FindGreatestSumOfSubArray1(int[] array) {
        int res = array[0]; //记录当前所有子数组的和的最大值
        int max=array[0];   //包含array[i]的连续数组最大值
        for (int i = 1; i < array.length; i++) {
            max=max(max+array[i], array[i]);
            res=max(max, res);
        }
        return res;
    }
}
