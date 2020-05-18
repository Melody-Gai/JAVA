public class TestDemo {
    public static void main(String args[]) {
        /*Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");*/

        TestDemo cm = new TestDemo();
        cm.complicatedexpression_r();

    }
    static void pong() {
        System.out.print("pong");
    }
    public void complicatedexpression_r(){
        int x=20, y=30;
        boolean b;
        b = x > 50 && y > 60 || x > 50 && y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
        System.out.println(b);
    }
}
