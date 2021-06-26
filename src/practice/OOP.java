package practice;

public class OOP {
	
	//pen OOP

String inkType = "gel";
String penColor = "Red";
String inkColor = "Black";
int pointSize = 10;

static boolean clicked = false;

public static void click() {
	clicked = true;
		
	}

public static void unclicked() {
	clicked = false;
}

//mp3 player OOP

String chargeType = "micro usb";
String [] controls = {"power", "volume", "play/pause"};
String color = "black";

static boolean power = false;
static int volume = 0;

public static void powerOn() {
	power = true;
}

public static void powerOff() {
	power = false;
}
 public static void volumeUp() {
	 volume++;
 }
 
 public static void volumeDown() {
volume--;
	
}

}