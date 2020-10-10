import java.math.*;
/**
 * @program: 20200911
 * @description：
 * @author: GAI
 * @create: 2020-09-11 19:22
 **/
public class Test {
    public static void main(String[] args) {
        double[] Temperature = new double[266];
        double[] array = new double[266];

        array[0] = 0.0024;
        Temperature[0] = 30;

        for (int i = 0; i <= 266; i++) {
            Temperature[i+1] = (173 * array[i] + Temperature[i])/(array[i] + 1);
            array[i + 1] = 0.01034 * Math.pow(Math.E,-0.0001532 * Temperature[i+1]) - 0.04459 * Math.pow(Math.E,-0.0579 * Temperature[i+ 1]);

        }

        for (double x:Temperature) {
            System.out.println(x);
        }

        System.out.println("============");

        for (double x:array) {
            System.out.println(x);
        }
    }
}
