public class test {
    public int addAB(int A,int B) {
        if (B == 0) {
            return A;
        }
        int sum = A ^ B;
        int jin = (A & B) << 1;
        return addAB(sum,jin);
    }
}
