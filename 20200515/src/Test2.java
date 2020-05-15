public class Test2 {
    public int[] multipy(int[] A) {
        int[] B = new int [A.length];
        boolean changed = false;
        for (int i = 0;i < B.length;i++) {
            B[i] = 1;
            for (int j = 0; j < A.length; j++) {
                int temp = 1;
                if (i == j){
                    changed = true;
                    temp = A[j];
                    A[j] = 1;
                }
                B[i] *= A[j];
                if (changed) {
                    A[i] = temp;
                    changed = false;
                }
            }
        }
        return B;
    }
}
