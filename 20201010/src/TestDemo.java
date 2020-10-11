/**
 * @program: 20201010
 * @description：通过类和对象简单实现加减乘除计算器
 * @author: GAI
 * @create: 2020-10-10 15:11
 **/

class Calculater {

    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - this.num2;
    }

    public int mul() {
        return this.num1 * this.num2;
    }

    public double dev() {
        return this.num1 * 0.1 / this.num2;
    }

}

public class TestDemo {

    public static void main(String[] args) {

        Calculater calculater = new Calculater();
        calculater.setNum1(20);
        calculater.setNum2(5);
        System.out.println("加法");
        System.out.println(calculater.add());
        System.out.println("减法");
        System.out.println(calculater.sub());
    }

}
