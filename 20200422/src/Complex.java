

/**
 * 这是一个用来练习语法的Complex实例
 * @author 李煜晨
 *
 */

public class Complex {
    /**
     * 虚数的实部
     */
    private double real;
    /**
     * 虚数的虚部
     */
    private double vir;

    public Complex() {
        this(0.0, 0.0);
    }

    public Complex(double real) {
        setReal(real);
    }

    public Complex(double real, double vir) {
        setReal(real);
        setVir(vir);
    }

    public Complex(Complex one) {
        this(one.real, one.vir);
    }

    /**
     * 实现一个数的相反数
     * @param one
     * @return
     */
    private static Complex opposite(Complex one) {
        return new Complex(-one.real, -one.vir);
    }

    /**
     * 实现一个数的倒数
     * @param one
     * @return
     */
    private static Complex reciprocal(Complex one) {
        double model = one.real * one.real + one.vir * one.vir;

        if (Math.abs(model) < 1e-6) {
            return null;
        }

        return new Complex(one.real / model, -one.vir / model);
    }

    /**
     * 这里实现的是one += another的运算
     */
    public Complex add(Complex another) {
        setReal(real + another.real);
        setVir(vir + another.vir);

        return this;
    }

    /**
     * 这里实现的是res = one + another的运算
     * @return
     */
    public static Complex add(Complex one, Complex another) {
        return new Complex(one).add(another);

        //Complex result = new Complex();

        //result.setReal(one.real + another.real);
        //result.setVir(one.vir + another.vir);

        //return result;
    }

    /**
     * 这里实现的是one -= another的运算
     */
    public Complex sub(Complex another) {
        return add(opposite(another));

        //setReal(real - another.real);
        //setVir(vir - another.vir);

        //return this;
    }

    /**
     * 这里实现的是res = one - another的运算
     * @return
     */
    public static Complex sub(Complex one, Complex another) {
        return new Complex(one).add(opposite(another));

        //Complex result = new Complex();

        //result.setReal(one.real - another.real);
        //result.setVir(one.vir - another.vir);

        //return result;
    }

    /**
     * 这里实现one *= another的运算
     * @param another
     */
    public Complex mul(Complex another) {
        double real = this.real;

        this.real = real * another.real - this.vir * another.vir;
        this.vir = real * another.vir + this.vir * another.real;

        return this;
    }

    /**
     * 这里实现res = one * another的运算
     * @return
     */
    public static Complex mul(Complex one, Complex another) {
        return new Complex(one).mul(another);
    }

    /**
     * 这里实现one /= another的运算
     * @return
     */
    public Complex div(Complex another) {
        Complex rec = reciprocal(another);

        return rec == null ? null : this.mul(rec);
    }

    /**
     * 这里实现res = one / another的运算
     * @return
     */
    public static Complex div(Complex one, Complex another) {
        Complex rec = reciprocal(another);

        return rec == null ? null : new Complex(one).mul(rec);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getVir() {
        return vir;
    }

    public void setVir(double vir) {
        this.vir = vir;
    }

    @Override
    public String toString() {
        return "(" + real + ", " + vir + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        if (!obj.getClass().equals(Complex.class)) {
            return false;
        }
        Complex tmp = (Complex)obj;

        return Math.abs(real - tmp.real) < 1e-6
                && Math.abs(vir - tmp.vir) < 1e-6;
    }
}
