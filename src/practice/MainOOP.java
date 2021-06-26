package practice;

public class MainOOP {

	public static void main(String[] args) {
		
		//pen
		OOP pen = new OOP();
		System.out.println(pen.inkType);
		System.out.println(pen.penColor);
		System.out.println(pen.inkColor);
		System.out.println(pen.pointSize);
	
		System.out.println(OOP.clicked);
		
		OOP.click();
		
		System.out.println(OOP.clicked);
		
		//mp3
		OOP mp3 = new OOP();
		System.out.println(mp3.chargeType);
		System.out.println(mp3.color);
		System.out.println(mp3.controls);
		
		System.out.println(OOP.power);
		OOP.powerOn();
		
	}

}
