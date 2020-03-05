import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuffer sb = new StringBuffer();
            for (char ch:str.toCharArray()) {
                if(ch >= '0' && ch <= '9') {
                    sb.append(ch);
                }else {
                    sb.append(" ");
                }
            }
            String str1 = sb.toString();
            String[] nums = str1.split("\\s+");
            int maxSize = 0;
            for (int i = 0; i < nums.length; i++) {
                maxSize = nums[i].length() > maxSize ? nums[i].length() : maxSize;
            }
            for (int i = 0; i < nums.length; i++) {
                if(maxSize == nums[i].length()) {
                    System.out.println(nums[i]);
                }
            }
        }
    }
}