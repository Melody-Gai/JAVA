/**
 * @program: 20201012
 * @description：
 * @author: GAI
 * @create: 2020-10-12 20:36
 **/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();
        int res = 0;
        int start = 0;
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start,last[index] + 1);
            res = Math.max(res,i - start + 1);
            last[index] = i;
        }
        return res;
    }
}

public class TestDemo {
    public static void main(String[] args) {

    }
}
