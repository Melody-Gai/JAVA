

class Solution4 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}

class Solution3 {
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

class Solution2 {
    public void rotate(int[] nums, int k) {
        int m = nums.length;
        k %= m;
        for (int i = 0; i < k; i++) {
            int tmp = nums[m - 1];
            for (int j = m - 1; j > 0 ; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }
}

class Solution1 {
    public String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] > 'A' && ch [i] < 'Z') {
                ch[i] += 32;
            }
        }
        return new String(ch);
    }
}

public class TestDemo {
}
