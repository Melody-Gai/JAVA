import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a);
        //注意，二者一般不在一起使用
        //因为nextLine()会把上面println的回车读入。
        String str = scan.nextLine();
        System.out.println(str);
        //应该用next();
        String str1 = scan.next();
        System.out.println(str);
    }
}
