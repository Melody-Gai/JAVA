import java.util.*;
import java.math.BigInteger;
public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            String s1 = input.next();
            String s2 = input.next();
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            System.out.println(num1.add(num2));
        }
    }
}