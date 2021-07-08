package scanner;

import java.util.Scanner;



public class scannerExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scan.next();
		
		System.out.println("What is your age?");
		int age = scan.nextInt();
		
		System.out.println("favorite quote");
		String quote = scan.next();
		
		System.out.println("Thank you" + name + "you are" + age + "years old.");
		
		System.out.println("favorite quote:" + quote);
	}

}
