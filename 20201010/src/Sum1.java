/**
 * @program: 20201010
 * @description：
 * @author: GAI
 * @create: 2020-10-10 19:40
 **/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return null;
    }
}

public class Sum1 {

    public static void main(String[] args) {

    }

}
