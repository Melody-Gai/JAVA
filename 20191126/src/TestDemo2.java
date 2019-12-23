/*public class TestDemo2 {
    //String StringBuilder 线程不安全的
    //StringBuffer 线程安全
    //StringBuilder，StringBuffer方法的使用都是一样的
    //String 之间的拼接  底层优化为StringBuilder了。 append（）；
    //StringBuilder，StringBuffer的append方法 不会产生新的对象。return this；
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.append("java");
        System.out.println(sb);
    }

    public static void main1(String[] args) {
        String str = "abc";
        String str1 = str + "def";
        //String的拼接底层会优化为StringBuilder
        System.out.println(str1);
    }
}*/
import java.util.*;

public class TestDemo2{

    public static void reverse(char[] array,int left,int right) {
        while (left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static String reverseSentence(String str) {
        char[] array = str.toCharArray();
        reverse(array,0,array.length-1);
        int i = 0;
        int j = 0;
        //单词逆置
        while (i < array.length) {
            if(array[i] == ' ') {
                i++;
                j++;
            }else if(j == array.length ||array[j] == ' ' ){
                reverse(array,i,j-1);
                i = ++j;
            }else {
                j++;
            }
        }
        return String.copyValueOf(array);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String ret = reverseSentence(str);
        System.out.println(ret);
    }
}
