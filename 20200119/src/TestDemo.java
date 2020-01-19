import java.lang.reflect.Array;
import java.util.Scanner;

class SolutionA {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        for (int i = 0; i < k; i++) {
            int tmp = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }
}
class Solution{
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0 ; i < chars.length; i++){
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}

class Solution1 {
    public String toLowerCase(String str) {
        if (str == null && "".equals(str)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

class Solution2 {
    public String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                c += 32;
            }
            result += c;
        }
        return result;
    }
}
public class TestDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SolutionA solutionA = new SolutionA();

        System.out.println();
    }

    public static void main3(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.toLowerCase("Hello!"));
    }

    //precondition:x>=0
    public void mystery(int x) {
        System.out.print(x % 10);
        if((x / 10) != 0) {
            mystery(x / 10);
        }
        System.out.println(x % 10);
    }
    public static void main2(String[] args) {
        TestDemo testDemo = new TestDemo();
        testDemo.mystery(1234);   //43211234
        System.out.println();
    }

    public static void main1(String[] args) {
        int x = 20;
        int y = 5;
        System.out.println(x+y +""+(x+y)+y);  //25255
    }
}
