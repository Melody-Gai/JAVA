

public class Test {
		
	public static void main(String[] args) {
		
		int[] array = {10,20};
		System.out.println("x = "+ array[0]);
		System.out.println("x = "+ array[1]);
		swap(array);
		System.out.println("x = "+ array[0]);
		System.out.println("x = "+ array[1]);
	}
		public static void swap(int[] array) {
	
		int tmp = array[0];
		array[0] = array[1];
		array[1] = tmp;
	}
	
	
}
		/*int x = 10;
		int y = 20;
		swap(x,y);
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		
	public static void swap(int a,int b) {
			
		int tmp = a;
		a = b;
		b = tmp;
	}*/
		

		
/*import java.util.Scanner;
import java.util.Random;

public class Test {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Random产生随机数的类
		Random rand = new Random();// 对象
		
		int randNum = rand.nextInt(100)+1;
		//[0,100)+1// [1-100]
		
		while(true) {
			System.out.println("输入你要猜的数字：");
			int num = scan.nextInt();
			
			if(num > randNum) {
				System.out.println("大了");
			}else if (num == randNum) {
				System.out.println("猜对了");
				break;
			}else {
				System.out.println("小了");
			}
		}
		scan.close();
	}
}
	
	
	
	public static void main1(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		while(scan.hasNextInt()) {
			num = scan.nextInt();
			System.out.println(num);
		}
		
		scan.close();
import java.util.Random;
import java.util.Scanner;;
public class Test {
	public static void main(String[] args) {
		Random random = new Random(); // 默认随机种子是系统时间
		Scanner sc = new Scanner(System.in);
		int toGuess = random.nextInt(100);
		// System.out.println("toGuess: " + toGuess);
		while (true) {
			System.out.println("请输入要输入的数字: (1-100)");
			int num = sc.nextInt();
			if (num < toGuess) {
				System.out.println("低了");
			} else if (num > toGuess) {
				System.out.println("高了");
				} else {
					System.out.println("猜对了");
					break;
				}
		}
			sc.close();
	}
} 
public class Test {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in)
	}
}
public class Test {
	
	public static void main(String[] args) {
		
		int ret = 1;
		int sumOdd = 0;
		for(int i = 1;i <= 5;i++) {
			for(int j = 1;j <= i;j++) {
				
				ret *= j;
			}
			
			sumOdd += ret;
			ret = 1;
		}
		System.out.println("sumOdd = "+ sumOdd);
	}
}
public class Test {
	
	public static void main(String[] args) {
	
		int sumOdd = 0;
		for(int i = 1;i <= 100;i++) {
			if(i %3 != 0) {
				
				continue;
				//System.out.println("i = "+ i);
				//break;
				//System.out.println("Hello");
			}
			
		}
		
			for(int i = 1;i <= 100;i += 2) {
				sumOdd += i;
			}
			
		
		System.out.println("sumOdd = "+ sumOdd);
		
		
	}
	
	
	
}*/