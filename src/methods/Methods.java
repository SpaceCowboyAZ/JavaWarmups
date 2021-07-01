package methods;

public class Methods {

	public static void main(String[] args) {
	
		welcome();
		
		multiply(60, 30);
		multiply(5, 2);
		multiply(6, 6);
		
		divide(30, 5);
		divide(36, 6);
		divide(4, 4);
		

	}

	public static void welcome() {
		System.out.println("Java calculator");
	}
	
	public static void multiply(int a, int b) {
		System.out.println(a * b);
		
	}
	
	public static void divide(int a, int b) {
		System.out.println(a / b);
	}
}
