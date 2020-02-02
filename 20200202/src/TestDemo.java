


class Solution1 {
    public int pivotIndex(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return -1;
        }
        int sum = 0;
        for (int i = 0;i < length;i++) {
            sum += nums[i];
        }
        int left = 0;
        int right = sum - nums[0];
        if (right == 0) {
            return 0;
        }
        for (int i = 1;i < length;i++) {
            left += nums[i-1];
            right -= nums[i];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}

class Solution {
    public int[] sortArrayByParity(int[] A) {
        if(A.length<=1){
            return A;
        }
        int i = 0;
        int temp;
        for(int j = 0;j<A.length;j++){
            // 是偶数
            if((A[i]&1)==0){
                i++;
            }else{
                if((A[j]&1)==0){
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                    i++;
                }
            }
        }
        return A;
    }
}
public class TestDemo {
    public static int factor(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factor(n - 1);
    }

    public static void main1(String[] args) {
        int n = 5;
        int ret = factor(n);
        System.out.println("ret = " + ret);
    }
    public static void func(int num) {
        if(num > 9) {
            func(num / 10);
        }
        System.out.println(num % 10);
    }

    public static void main2(String[] args) {
        func(1234);
    }
    public static int sum (int num) {
        if(num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }

    public static void main3(String[] args) {
        System.out.println(sum(10));
    }
    public static int func1(int num) {
        if(num <= 9) {
            return num;
        }
        return (num % 10) + func1(num / 10);
    }

    public static void main4(String[] args) {
        int ret = func1(1234);
        System.out.println(ret);
    }
    public static int fab (int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fab(n - 1) + fab(n - 2);
    }

    public static void main5(String[] args) {
        System.out.println(fab(20));
    }
    public static int fab1(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for(int i = 3;i <= n;i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main6(String[] args) {
        System.out.println(fab(20));
    }
    public static int fab2(int n) {
        if(n == 1 || n== 2) {
            return n;
        }
        return fab2(n - 1) + fab2(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fab2(4));
    }

}
