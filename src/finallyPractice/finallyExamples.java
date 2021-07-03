package finallyPractice;

import java.util.Scanner;

public class finallyExamples {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.next());
		scan.close();
		
		try {
			System.out.println(scan.next());
			
		} catch(Exception e ) {
			
			System.out.println(e);
	
		} finally {
			
			scan.close();
		}
		
		
		
		try {
			int a = 5 / 0;
			//no java lang error
			int b = 5 / 1;
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		} finally {
			
			System.out.println("Finally always gets run :)");
		}

	}

}
