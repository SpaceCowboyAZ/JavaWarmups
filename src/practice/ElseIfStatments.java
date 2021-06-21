package practice;

import java.util.Scanner;

public class ElseIfStatments {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade:");

		int a = scan.nextInt();
		System.out.println(a);
		
		if(a >= 90 && a <= 100) {
			System.out.println("A");
			
		} else if(a >= 80 && a <= 90) {
				System.out.println("B");
				
		} else if(a >= 70 && a <= 80) {
					System.out.println("C");
					
		} else if(a >= 60 && a <= 70) {
						System.out.println("D");
						
		} else if(a >= 0 && a <= 60) {
							System.out.println("F");
		} else {
			System.out.println("The number you entered is not valid.");
	
		
		}
	}
}					
		
