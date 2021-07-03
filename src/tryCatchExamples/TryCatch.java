package tryCatchExamples;

import java.util.Scanner;
import java.lang.*;
public class TryCatch {

	public static void main(String[] args) {
		
//		try {
//			int[] c= {4};
//			System.out.println(c[1]);
//		}catch(NullPointerException e ) {
//			System.out.println("The array is null");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("The index is out of bounds");
//		} catch(Exception e ) {
//			System.out.println("Something went wrong");
//		}
		
//		try {
//		int[] b = null;
//		System.out.println(b[1]);
//		} catch(NullPointerException e) {
//			System.out.println("The array is empty");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		try {
			int n = scan.nextInt();
			System.out.println(n);
		} catch(Exception e) {
			System.out.println("Error: Please enter a number.");
		}
		
//		try {
//		int[] a = {4, 7, 5};
//		System.out.println(a[3]);
//	} catch(Exception e) {
//		System.out.println("Exception happened");
//	}

}
}