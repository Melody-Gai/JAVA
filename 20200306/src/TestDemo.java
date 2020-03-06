import java.util.Scanner;
public class TestDemo {
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        for (int i = 0; i < ch2.length; i++) {
            for(int j = 0; i < ch1.length; j++) {
                if(ch1[j] == ch2[i]) {
                    for (int k = j; k < ch1.length; k++) {
                        ch1[k] = ch1[k + 1];
                    }
                }
            }
        }
        System.out.println(ch1);
    }
}