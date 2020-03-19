import java.util.Arrays;

class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
    public boolean canConstruct(String ransomNote, String magazine) {
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

    public static void main(String[] args) {
        int[] array1 = new int[10];
        array1[0] = 1;
        array1[1] = 5;
        array1[2] = 2;
        array1[3] = 9;
        array1[4] = 6;
        array1[5] = 3;
        array1[6] = 4;
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

}
