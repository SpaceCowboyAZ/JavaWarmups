package enumsExamples;

enum zombies {
	crawler, slow, fast;
}
public class Enumss {

//	static String[] zombies = {"slow", "crawler", "fast"};
	
	public static void main(String[] args) {
		zombies z = zombies.crawler;
		System.out.println(z);
		
		switch(z) {
		case crawler:
			System.out.println("crawling zombie");
			break;
		case slow:
			System.out.println("slow zombie");
			break;
		case fast:
			System.out.println("fast zombie");
			break;
		}
		
	}

}
