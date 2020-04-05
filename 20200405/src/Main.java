import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.next();
            char[] array = s.toCharArray();
            for(char c : array) {
                String s1 = Integer.toBinaryString(c);
                String s2 = String.format("%07d",Integer.parseInt(s1));
                int count = 0;
                for(int j = 0;j < 7;j++) {
                    if(s2.charAt(j) == '1')    count++;
                }
                System.out.println(count % 2 == 0 ? "1" + s2 : "0" + s2);
            }
        }
    }
}