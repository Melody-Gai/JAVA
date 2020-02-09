import java.util.Arrays;

class Solution{
    public boolean canConstruct(String ransomNote,String magazine) {
        char[] chars1 = ransomNote.toCharArray();
        char[] chars2 = magazine.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        int i = 0;
        int j = 0;
        while(i < chars1.length && j < chars2.length) {
            if(chars1[i] == chars2[j]) {
                i++;
                j++;
            }else {
                if(chars2[j] > chars1[i]) {
                    return false;
                }
                j++;
            }
        }
        if(i == chars1.length) {
            return true;
        }else {
            return false;
        }
    }
}

class Solution5{
    public boolean canConstruct(String ransomNote,String magazine) {
        int[] words = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            char cur = ransomNote.charAt(i);
            words[cur - 'a']++;
        }
        int len = ransomNote.length();
        for (int i = 0; i < magazine.length() && len > 0; i++) {
            char cur = magazine.charAt(i);
            if(words[cur - 'a'] != 0) {
                len--;
                words[cur - 'a']--;
            }
        }
        return len == 0;
    }
}

class Solution4{
    public int searchInsert(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}

class Solution3{
    public int removeElement(int[] nums,int val) {
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

class Solution2{
    public void rotate(int[]nums,int k) {
        int n = nums.length;
        k %= n;
        for (int i = 0; i < k; i++) {
            int tmp = nums[n - 1];
            for (int j =  n - 1; j > 0 ; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }
}

class solution1{ 
    public String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;
            }
        }
        return new String(ch);
    }
}


public class TestDemo {
}
