class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
            if(nums[nums.length - 1] < target) {
                return i + 1;
            }
        }
        return nums.length;
    }
}

class Solution1 {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}

public class TestDemo {
    public static void main(String args[]) {
        int i = 7;
        do {
            System.out.println(--i);
                --i;
        } while (i != 0);
            System.out.println(i);
    }
}
