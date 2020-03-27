import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short num = scanner.nextShort();
        short[] nums = new short[num];
        for (int i = 0; i < num; i++) {
            nums[i] = scanner.nextShort();
        }

        float[] A = new float[6];
        int[] geshu = new int[5];
        for (int i= 0; i < nums.length; i++) {
            if(nums[i] % 5 == 0 && nums[i] % 2 == 0) {
                A[1] += nums[i];
                geshu[0]++;
            }
            if(nums[i] % 5 == 1) {
                geshu[1]++;
                if(geshu[1] % 2 == 1) {
                    A[2] += nums[i];
                }else {
                    A[2] += (-nums[i]);
                }
                if(nums[i] % 5 == 2) {
                    A[3]++;
                    geshu[2]++;
                }
                if(nums[i] % 5 == 3) {
                    A[4]++;
                    geshu[3]++;
                }
                if(nums[i] % 5 == 4) {
                    geshu[4]++;
                    if(nums[i] > A[5]) {
                        A[5] = nums[i];
                    }
                }

            }

        }
        A[4] /= geshu[3];
        for (int i = 0; i < 5; i++) {
            if(geshu[i] == 0 && i != 4) {
                System.out.print("N ");
            }else if(i == 3 && geshu[i] != 0) {
                System.out.printf("%.1f",A[i + 1]);
            }else if(i == 4 && geshu[i] == 0) {
                System.out.println("N");
            }else {
                System.out.printf("%d ",(int)A[i + 1]);
            }
        }
    }
}