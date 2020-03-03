/*
import java.util.Scanner;
import java.util.*;
public class TestDemo {
    public static void main(String[] args) {

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner str = new Scanner(System.in);

            }
        }
//利用额外空间
        public class PalindromeList {
            public boolean chkPalindrome(ListNode A) {
                ListNode p = A;                 //指向表头
                int len = 0;                    //记录表长
                while(p != null){
                    len ++;
                    p = p.next;
                }
                //定义一个长度相同数组保存链表的数据
                int[] a = new int[len];
                for(int i=0; i<len; i++){
                    a[i] = A.val;
                    A = A.next;
                }
                //转化为判断数组回文
                for(int i=0; i<len/2; i++){
                    if(a[i] != a[len-1-i]){
                        return false;
                    }
                }
                return true;
            }
        }
    }
}*/
