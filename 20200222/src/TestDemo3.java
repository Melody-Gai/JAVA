public class TestDemo3 extends Base{
    public static void main(String[] args) {
        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }

    String str=new String("good");
    char[]ch={'a','b','c'};

    public static void main3(String args[]){
        boolean b=true?false:true==true?false:true;
        System.out.println(b);
        TestDemo3 ex=new TestDemo3();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    } public void change(String str,char ch[]){
//引用类型变量，传递的是地址，属于引用传递。
        str="test ok";
        ch[0]='g';
    }

    public static void main2( String[] args ) {
        new TestDemo3();
//调用父类无参的构造方法
        new Base();
    }

    public static void main1(String args[]){
        System.out.println(100%3);
        System.out.println(100%3.0);
    }
}

class HasStatic{
    private static int x = 100;
    public static void main1(String args[ ]){
        HasStatic hs1 = new HasStatic();
        hs1.x++;
        HasStatic hs2 = new HasStatic();
        hs2.x++;
        hs1=new HasStatic();
        hs1.x++;
        HasStatic.x--;
        System.out.println( "x=" +x);
    }
}
class Base {
    Base() {
        //System.out.print("Base");
    }
}