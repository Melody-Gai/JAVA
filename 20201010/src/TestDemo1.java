/**
 * @program: 20201010
 * @description：
 * @author: GAI
 * @create: 2020-10-10 15:34
 **/

class ExchangeValue{
    public int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

class MyValue{
    public int val;


}

public class TestDemo1 {

    public static void swap(MyValue val1,MyValue val2) {
        int temp = val1.val;
        val1.val = val2.val;
        val2.val = temp;
    }

    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.val = 10;

        MyValue myValue2 = new MyValue();
        myValue2.val = 20;

        System.out.println(myValue1.val);
        System.out.println(myValue2.val);
        System.out.println("=========");
        swap(myValue1,myValue2);
        System.out.println(myValue1.val);
        System.out.println(myValue2.val);

    }

    public static void swap1(ExchangeValue val1,ExchangeValue val2) {
        int temp = val1.getVal();
        val1.setVal(val2.getVal());
        val2.setVal(temp);
    }

    public static void main1(String[] args) {
        ExchangeValue exchangeValue1 = new ExchangeValue();
        exchangeValue1.setVal(10);

        ExchangeValue exchangeValue2 = new ExchangeValue();
        exchangeValue2.setVal(20);

        System.out.println(exchangeValue1.getVal());
        System.out.println(exchangeValue2.getVal());
        System.out.println("=========");
        swap1(exchangeValue1,exchangeValue2);
        System.out.println(exchangeValue1.getVal());
        System.out.println(exchangeValue2.getVal());

    }

}
