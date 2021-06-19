package practice;

public class PrimitiveTypes {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c= 0;
		
		System.out.println(a * b);
		System.out.println(b + c);
		System.out.println(a - b);
		// will round down because int stores whole numbers. double will use decimals
		System.out.println(a / b);
		System.out.println(c - b);
		
		
		//Need L at the end of long
		long d = 99999999999L;
		//need F at the end of flat
		float e = 2.5f;
		double f = 6.4;
		System.out.println(d);
		System.out.println(e + f);
		System.out.println(f / e);
	}

}
