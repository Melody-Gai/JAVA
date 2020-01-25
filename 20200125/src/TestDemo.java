
class Solution2 {
    public boolean isPalindrome(int x) {
        int a = x;
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        int t = 0;
        while (x > 0) {
            t = t * 10 + x % 10;//t = 0 + 1 //t = 1 + 2 = 3//t = 3 +
            x /= 10;//x = 121 / 10 = 12//x = 1
        }
        return t == a;
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        String array = String.valueOf(x);
        int i = 0;
        int j = array.length() - 1;
        while (i < j) {
            if (array.charAt(i++) != array.charAt(j--))
                return false;
        }
        return true;
    }
}

class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] words = new int[26];
        for(int i = 0; i < ransomNote.length(); i++){
            char cur = ransomNote.charAt(i);
            words[cur-'a']++;
        }
        int len = ransomNote.length();
        for(int i = 0; i<magazine.length()&&len>0; i++){
            char cur = magazine.charAt(i);
            if(words[cur-'a']!=0) {
                len--;
                words[cur-'a']--;
            }
        }
        return len==0;
    }
}

public class TestDemo {
}
