public class TestDemo {

    //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本
    //身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
    public static void main2(String[] args) {

        for (int i = 100; i <= 999 ; i++) {
            int a= i % 100;
            int b = i / 10 % 10;
            int c= i / 100;
            int n = a*a*a + b*b*b + c*c*c;
            if(i == n) {
                System.out.println(i);
            }
        }

    }

    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
    public static void main1(String[] args) {
        double sum = 0;
        for(int i = 1;i <= 100;i++) {
            if(i % 2 != 0) {
                double tmp = 1.0 / i;
                sum += tmp;
            }
            if(i % 2 == 0) {
                double tmp = (1.0 / i);
                tmp = - tmp;
                sum += tmp;
            }
        }
        System.out.println(sum);
    }
    public static void move(char pos1,char pos2) {
        System.out.println(pos1 + "->" + pos2);
    }
    //pos1通过pos2移动到pos3
    public static void Hanota(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        }
        else {
            Hanota(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            Hanota(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        Hanota(n,'A','B','C');
    }
}

/*public class Test {

	public static void main(String[] args) {
		int n = 5;
		int ret = factor(n);
		System.out.println("ret = " + ret);
	}
	public static int factor(int n) {
		if (n == 1) {
		return 1;
		}
		return n * factor(n - 1); // factor 调用函数自身
	}
}

public class Test {
	//青蛙跳台阶  斐波那契数列
	public static int fab (int n) {
		if(n == 1 || n == 2) {
			return n;

		}
		return fab(n-1) + fab(n-2);
	}
	public static void main(String[] args) {

		System.out.println(fab(4));
	}
}

public class Test {
//青蛙跳台阶非递归
	public static int fab (int n) {
		int f1 = 1;
		int f2 = 2;
		int f3 = 1;

		if(n == 1 || n == 2) {
			return n;
		}
		for(int i = 3;i <= n;i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		return f3;
	}
	public static void main(String[] args) {

		System.out.println(fab(4));
	}
}


public class Test {
	//迭代=循环
	public static int fab (int n) {
		int f1 = 1;
		int f2 = 1;
		int f3 = 1;

		for(int i = 3;i <= n;i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		return f3;
	}
	public static void main(String[] args) {

		System.out.println(fab(20));
	}
}

public class Test {
	//递归
	public static int fab (int n) {
		if(n == 1 || n == 2) {
			return 1;

		}
		return fab(n-1) + fab(n-2);
	}
	public static void main(String[] args) {

		System.out.println(fab(20));
	}
}
public class Test {

	public static int func (int num) {

		if(num <= 9) {

			return num;
		}
		return (num % 10) + func(num / 10);
	}
	public static void main(String[] args) {

		func(1234);
		System.out.println(func(1234));
	}
}
public class Test {

	public static int sum (int num) {

		if(num == 1) {
			return 1;
		}
		return num + sum(num - 1);

	}

	public static void main(String[] args) {

		System.out.println(sum(10));
	}
}
public class Test {

	public static void func(int num) {

		if(num > 9) {
			func(num / 10);
		}
		System.out.println(num % 10);
	}

	public static void main(String[] args) {

		func(1234);

	}
}*/