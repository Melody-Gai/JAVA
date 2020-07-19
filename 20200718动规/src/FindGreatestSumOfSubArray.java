import static java.lang.Math.max;

public class FindGreatestSumOfSubArray {
    public static void main(String[] args) {

    }
    public class Solution {
        public int FindGreatestSumOfSubArray(int[] array) {
            int[] maxSum = new int[array.length];
            maxSum[0] = array[0];
            for (int i = 1; i <= array.length; ++i) {
                maxSum[i] = max(maxSum[i - 1] + array[i], array[i]);
            }
            int ret = maxSum[0];
            for (int j = 0; j < maxSum.length; j++) {
                ret = max(ret, maxSum[j]);
            }
            return ret;
        }
    }
}
