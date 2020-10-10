/**
 * @program: 20200830
 * @description：
 * @author: GAI
 * @create: 2020-08-30 17:33
 **/
public class TestDemo {
//数组中只出现一次的数
    public static void main(String[] args) {
        int[] array = {1,2,4,1,4};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^=array[i];
        }
        System.out.println(ret);
    }

}
