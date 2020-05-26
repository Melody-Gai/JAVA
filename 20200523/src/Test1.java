public class Test1 {
    public int addAB(int A,int B) {
        if (B == 0) {
            return A;
        }
        int sum = A ^ B;
        int jin = (A & B) << 1;
        return addAB(sum,jin);
    }

    public static void main(String[] args) {
        Test1 ts = new Test1();
        int a = ts.addAB(18,21);
        System.out.println(a);
    }
}
