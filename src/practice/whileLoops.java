package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class whileLoops {

	public static void main(String[] args) {
		
		int a = 0;
		while(a < 10) {
		System.out.println("a is  less than 10: " + a);
		a++;
		
		}
		
		int b = 0;
		do {
			System.out.println("b");
		} while (b == 1);
	
//will separate the String sentence by commas
		String sentence = "Waffles are better than pancakes";
				Scanner scan = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan.hasNext()) {
			words.add(scan.next());
		}
		System.out.println(words);
	}
}

