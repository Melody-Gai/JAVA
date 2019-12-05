

public class Test {
	public static void main (String[] args) {
		
		int num = 5;
		int i = 1;
		int ret = 1;
		int sum = 0;
		
		while(i <= num) {
			ret = 1;
			int j = 1;
			while(j <= i) {
				ret *= j;
				j++;
			}
			
			sum += ret;
			i++;
		}	
		System.out.println("sum == " + sum);
		
	}
}

/*int a = 10;
		if(a>10) {
			System.out.println("a > 10");
		}else {
			System.out.println("a <= 10");
		}
		public class Test {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			
		}
		System.out.println("java 20");
	}
}
		
		int c = 10;
        int d = 20;
        int tem = c;
        c = d;
        d = tem;
        System.out.println(c);
        System.out.println(d);public class Test{
	public static void main(String[] args){
	int num = 5;
	int i = 1;
	int ret = 1;
	int sum = 0;
	while(num>0){
		
	  while(i<=num){
		 ret*=i;
		 i++;
	   }
	  sum +=ret;
	   num--;
	}
	System.out.println(sum);
	}
}
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(-1>>>1);
		System.out.println(10 > 20 & 10 / 0 == 0);
		System.out.println(10 < 20 | 10 / 0 == 0);
		System.out.println(a != b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a > b);
		System.out.println(a < b);
		int a = 10;
		a += 1;
		System.out.println(a);
		System.out.println(10%3);
		System.out.println(10%-3);
		System.out.println(-10%3);
		System.out.println(-10%-3);
		System.out.println(10.0%1.5);
	}
	
	
	
	public static void main1(String[] args) {
		
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			
		}
		System.out.println("java 20");
		
		
		public class Test{
	public static void main(String[] args){
	int num = 5;
	int i = 1;
	int ret = 1;
	int sum = 0;
	while(num>0){
		
	  while(i<=num){
		 ret*=i;
		 i++;
	   }
	  sum +=ret;
	   num--;
	}
	System.out.println(sum);
	}
}
	}
}
*/
