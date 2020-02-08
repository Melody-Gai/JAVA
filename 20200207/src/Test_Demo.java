import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        for(int i = 0;i < k ;i++) {
            int tmp = nums[n - 1];
            for(int j = n -1;j > 0;j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }
}

class Solution1 {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
//char[] ch = str.toCharArray();
//return new String(ch);

public class Test_Demo {
    public static void main(String[] args) {

    }
}
