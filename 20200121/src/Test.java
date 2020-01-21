public class Test {

    public static void main(String[] args) {


    }
}
/*public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nexInt();
	}
	public static void printAge(int age) {
		if(age <= 18) {
			System.out.println("少年")；
		}else if(age >= 19 && age <=28) {
			System.out.println("青年")；
		}else if(age >= 29 && age <=55) {
			System.out.println("中年")；
		}else if(age >= 56) {
			System.out.println("老年")；
		}
	}
}
public class Test {

	public static boolean isLeapYear(int year) {
		if(age <= 18) {
			System.out.println("少年")；
		}else if(age >= 19 && age <=28) {
			System.out.println("青年")；
		}else if(age >= 29 && age <=55) {
			System.out.println("中年")；
		}else if(age >= 56) {
			System.out.println("老年")；
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int age = scanner.nexInt();
		int n = scanner.nexInt();
		//System.out.println("少年")；
		//System.out.println("flg")；
		boolean flg = isPrime1(n);
	}
	public static boolean isPrime3(int n) {
		for(int i = 2;i <= Math.sqrt(n);i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime2(int n) {
		for(int i = 2;i <= n/2;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime1(int n) {
		for(int i = 2;i < n;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void printAge(int age) {
		if(age <= 18) {
			System.out.println("少年")；
		}else if(age >= 19 && age <=28) {
			System.out.println("青年")；
		}else if(age >= 29 && age <=55) {
			System.out.println("中年")；
		}else if(age >= 56) {
			System.out.println("老年")；
		}
	}
}*/
