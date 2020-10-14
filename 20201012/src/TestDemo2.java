/**
 * @program: 20201012
 * @description：回文数
 * @author: GAI
 * @create: 2020-10-14 22:47
 **/
public class TestDemo2 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isPalindrome(int x) {
            int k = x;
            if(k<0)
                return false;
            int n=0;
            while(k>0){
                n = k%10 + n*10;
                k /= 10;
            }
            return (x==n) ? true : false;
        }
    }
}
