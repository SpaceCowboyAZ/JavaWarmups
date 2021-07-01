package methods;

public class ReturnStatements {

	public static void main(String[] args) {
		printMessage();
		int sum = add(5, 4);
		System.out.println(sum);
		
		double total = multiply(2.5, 2.5);
		System.out.println(total);
	
		String shout = upperCase("i have the high ground anakin, it's over!");
		System.out.println(shout);
		
		
		int[] ints = arrayFromInts(5, 8, 9);
		System.out.println(ints[0]);
		System.out.println(ints[1]);
		System.out.println(ints[2]);
		
	}

	public static void printMessage() {
		System.out.println("Return statement method practice");
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
		
	}
	
	public static String upperCase(String s) {
		return s.toUpperCase();
	}
	
	public static int [] arrayFromInts(int a, int b, int c ) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}
}
