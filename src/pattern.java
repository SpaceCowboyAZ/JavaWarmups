import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		
		System.out.println("How many stars do you want?");
		Scanner scan = new Scanner(System.in);
		int numOfStars = scan.nextInt();
		
		for(int i = 0; i <= numOfStars; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
		}
		System.out.println();
	}

		for(int i = numOfStars - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
		}
		System.out.println();
			
		}
}
}
