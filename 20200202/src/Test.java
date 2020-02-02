import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void move (char pos1,char pos2) {
        System.out.println(pos1 + "->" + pos2);
    }
    public static void Hanota (int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        }
        else {
            Hanota(n - 1,pos1,pos3,pos2);
            move(pos1,pos3);
            Hanota(n - 1,pos2,pos1,pos3);
        }
    }

    public static void main1(String[] args) {
        int n = 3;
        Hanota(n,'A','B','C');
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        while(true) {
            System.out.println("请输入你要猜的数字：");
            int num = scan.nextInt();
            if(num > randNum) {
                System.out.println("大了");
            }
            else if(num == randNum) {
                System.out.println("猜对了");
                break;
            }else {
                System.out.println("小了");
            }
        }
        scan.close();
    }
}
