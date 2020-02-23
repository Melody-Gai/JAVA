import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            int tmp = str.charAt(i);
            if(!builder.toString().contains(str)) {
                builder.append(str);
            }
        }
        System.out.println(str.length());
    }
}
