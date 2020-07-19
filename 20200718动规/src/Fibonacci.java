public class Fibonacci {
    public static void main(String[] args) {

    }
    public class Solution {
        public int Fibonacci(int n) {
            if(n == 0) return 0;
            if(n < 3) return 1;
            else {
                int[] f = new int[n + 1];
                f[0] = 0;
                f[1] = f[2] = 1;
                for(int i = 3;i <= n; ++i){
                    f[i] = f[i - 1] + f[i - 2];
                }
                return f[n];
            }
        }
    }
}
