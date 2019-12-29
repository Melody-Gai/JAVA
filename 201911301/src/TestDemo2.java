import java.util.*;

public class TestDemo2 {


        public static void tiaozheng(String str) {
            int count = 0;
            int i = 0;
            char tmp;
            char[] s = str.toCharArray();
            for(i = 0;i < str.length();i++) {
                if('*' == s[i]) {
                    while(i != count) {
                        s[i] = s[i-1];
                        s[i-1] = '*';
                        i--;
                    }
                    count++;
                }
            }
            System.out.println(s);
        }
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            tiaozheng(str);
        }

}
