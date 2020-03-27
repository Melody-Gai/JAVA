import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short number = scanner.nextShort();    //整数个数
        short[] numbers = new short[number];
        for(int i=0;i<number;i++)
            numbers[i]=scanner.nextShort();

        float[] A=new float[6];
        int[] geshu= new int[5];           //记录各类数字的个数
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]%5==0 && numbers[i]%2==0) {    //计算A1
                A[1]+=numbers[i];
                geshu[0]++;
            }

            if(numbers[i]%5==1) {                     //计算A2
                geshu[1]++;
                if(geshu[1]%2==1)
                    A[2]+=numbers[i];
                else
                    A[2]+=(-numbers[i]);
            }

            if(numbers[i]%5==2) {                       //计算A3
                A[3]++;
                geshu[2]++;
            }

            if(numbers[i]%5==3) {
                A[4]+=numbers[i];
                geshu[3]++;
            }

            if(numbers[i]%5==4) {                       //计算A5
                geshu[4]++;
                if(numbers[i]>A[5])
                    A[5]=numbers[i];
            }
        }
        A[4]/=geshu[3];                                  //计算A4

        for(int i=0;i<5;i++) {
            if(geshu[i]==0&&i!=4)
                System.out.print("N ");
            else if(i==3&&geshu[i]!=0)
                System.out.printf("%.1f ",A[i+1]);
            else if(i==4&&geshu[i]!=0)
                System.out.printf("%d\n",(int)A[i+1]);
            else if(i==4&&geshu[i]==0)
                System.out.println("N");
            else
                System.out.printf("%d ",(int)A[i+1]);
        }

    }
}