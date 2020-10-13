/**
 * @program: 20201012
 * @description：整数反转
 * @author: GAI
 * @create: 2020-10-13 20:15
 **/



public class TestDemo1 {
    public static void main(String[] args) {

    }

    public int reverse(int x) {
        long l;//防止溢出
        char t;//交换字符
        String s=Integer.toString(x);//转化为字符串
        char []c1=s.toCharArray();//字符串转字符数组
        for(int i=0;i<c1.length/2;i++){
            //交换字符
            t=c1[c1.length-1-i];
            c1[c1.length-1-i]=c1[i];
            c1[i]=t;
        }
        if(x<0)//小于零的数，把负号换成0
        {  c1[c1.length-1]='0';
            s=new String(c1);//字符数组转字符串
            l=Long.parseLong(s);
            l=l/10*(-1);//换成0后，数会*10，所以要除以十，负数乘-1
        }
        else {
            s=new String(c1);
            l=Long.parseLong(s);
        }

        if(l>Integer.MAX_VALUE||l<Integer.MIN_VALUE)//溢出返回0
            l=0;

        return (int) l;
    }

    class Solution1 {
        public int reverse(int x) {
            long n = 0;
            while(x != 0) {
                n = n * 10 + x % 10;
                x = x / 10;
            }
            return (int) n == n ? (int)n : 0;
        }
    }
}
