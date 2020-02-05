
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int flg = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                res[0] = i;
                flg = 1;
                break;
            }
        }
        if(flg == 0) {
            res[0] = -1;
        }

        for(int j = res[0] + 1;  j < nums.length;j++) {
            if(nums[j] == target) {
                res[1] = j;
                flg = 2;
                break;
            }
        }
        if(flg == 0) {
            res[1] = -1;
        }

        if(flg == 0 && res[0] + 1 >nums.length - 1) {
            res[0] = -1;
            res[1] = -1;
        }
        return res;
    }
}

public class TestDemo {
}
