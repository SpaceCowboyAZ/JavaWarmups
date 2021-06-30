package constructors;

public class guitar {

 public static String color;
 public static double size;
	
	guitar(String color, double size) {
		
		
	}
	
	public static void putOn() {
		System.out.println("Guitar is  on");
	
}

public static void takeOff() {
System.out.println("Guitar is off");
}

public static void setColor(String newColor) {
	color = newColor;
}

public static void setSize (double newSize) {
	size = newSize;
}
}