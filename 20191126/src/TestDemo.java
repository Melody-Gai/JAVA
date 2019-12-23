import java.util.*;
import java.lang.*;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class TestDemo {
//将字符串进行逆置


    public static String reverse(String str) {
        char[] array = str.toCharArray();
        int left = 0;
/*        int right = array.length - 1;

        while(left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;

        }*/
        return String.copyValueOf(array);
    }

    public static void main12(String[] args) {
        String str = "abcdef";
        String ret = reverse(str);
        System.out.println(ret);
    }

    public static void main11(String[] args) {
        String string = "abcdefhello";
        String str2 = "java";
        System.out.println(string.toUpperCase());//小写转大写
        System.out.println(string.toLowerCase());
        System.out.println(string.substring(3,6));//前闭后开[)
        System.out.println(string.concat(str2));
        String str3 = "";//null
        System.out.println(str3.isEmpty());
    }

    public static void main10(String[] args) {
        String str = "198.168.1.1";
        String[] strings = str.split("\\.");
        for(int i = 0;i < strings.length;i++) {
            System.out.println(strings[i]);
        }
    }

    public static void main9(String[] args) {
        String str2 = "A,BC AB,C B,A";
        String[] strings = str2.split(" ",2);

        //String[] strings = str2.split(" ");
        System.out.println(Arrays.toString(strings));
        for(int i = 0;i < strings.length;i++) {
            String[] strings1 = strings[i].split(",");
            System.out.println(Arrays.toString(strings1));
        }
    }

    public static void main8(String[] args) {
        String str2 = "    abc   def    ";
        System.out.println(str2.replace('a','g'));
        System.out.println(str2.replace("ab","##"));
        System.out.println(str2.replaceAll("ab","##"));
        System.out.println(str2.replaceFirst("ab","##"));
    }
    public static void main7(String[] args) {
        String str2 = "    abc   def    ";
        System.out.println(str2.contains("cde"));
        System.out.println(str2.startsWith("abc",2));
        System.out.println(str2.endsWith("fe"));
        System.out.println(str2.trim());//将该字符串的首位空格去掉，中间空格保留
        //查找子串，返回下标
        System.out.println(str2.indexOf("cde",1));
        System.out.println(str2.lastIndexOf("ab",0));
    }

    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
    }

    public static void main5(String[] args) {
        String str = "123456";
        System.out.println(isNumber(str));
    }
    public static boolean isNumber(String str) {
        char[] data = str.toCharArray() ;
        for (int i = 0; i < str.length(); i++) {
            if (data[i]<'0' || data[i]>'9') {
                return false ;
            }
        }
        return true ;
    }

    public static void main4(String[] args) {
        String str1 = "abcdef";
        String str2 = new String("abcdef").intern();
        System.out.println(str1 == str2);
    }

    public static void main3(String[] args) {
        String str = "abcdef";//直接赋值
        String str2 = "abc"+"def";//拼接:编译期间已经处理为“abcdef”
        System.out.println(str == str2);
        String str3 = "abc" + new String("def") ;
        System.out.println(str == str3);
        String str4 = "abc";
        String str5 = "def";
        String str6 = str4 + str5;//拼接后str6在堆上
        System.out.println(str == str6);
        String str7 = str4 + new String("def") ;
        System.out.println(str == str7);
        System.out.println(str3 == str7);
    }

    public static void main2(String[] args) {
        String str = "abcdef";//直接赋值
        String str2 = new String("abcdef");
        System.out.println(str == str2);//比较地址
        System.out.println(str.equals(str2));//比较内容
        char[] array = {'a','b'};
        String str3 = new String(array);
        System.out.println(str == str3);
    }

    public static void main1(String[] args) {
        String str = "abcdef";//直接赋值
        String str2 = new String("abcde");
        char[] array = {'a','b'};
        String str3 = new String(array);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
}
