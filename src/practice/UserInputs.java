package practice;

import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter guitar brand");
			String guitarBrand = scan.nextLine();
			System.out.println(guitarBrand);

			
			System.out.println("Enter guitar model");
			String guitarModel = scan.nextLine();
			System.out.println(guitarModel);
			
			
			System.out.println("Enter guitar color");
			String guitarColor = scan.nextLine();
			System.out.println(guitarColor);

			System.out.println("Here is your guitar:");
			System.out.println(guitarBrand);
			System.out.println(guitarModel);
			System.out.println(guitarColor);

	}

}
