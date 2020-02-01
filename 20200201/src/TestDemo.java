import java.util.Arrays;

class Solution5 {
    public String reverseOnlyLetters(String S) {
        char[] arr=S.toCharArray();
        int i=0,j=arr.length-1;
        char temp='0';
        while(i<j){
            while(!(('a'<=arr[i]&&arr[i]<='z')||('A'<=arr[i]&&arr[i]<='Z'))&&i<j){
                i++;
            }
            while(!(('a'<=arr[j]&&arr[j]<='z')||('A'<=arr[j]&&arr[j]<='Z'))&&i<j){
                j--;
            }
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}

class Solution4 {
    public int[] sortedSquares(int[] A) {
        for(int i=0; i<A.length; i++)  A[i] *= A[i];
        Arrays.sort(A);
        return A;
    }
}

class Solution3 {
    public boolean isLongPressedName(String name, String typed) {
        int len_n = name.length();
        int len_t = typed.length();
        if(len_n>len_t){
            return false;
        }
        int i=0;
        int j=0;
        while(i<len_n&&j<len_t){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else if(j>0&&typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        }
        return i ==len_n;
    }
}

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        boolean falg = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if(nums[i] == nums[j]) {
                    falg = true;
                }
            }
        }
        return falg;
    }
}

class Solution1 {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }
    }
}

class Example{
    String str=new String("hello");
    char[]ch={'a','b'};
    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='c';
    }
}
