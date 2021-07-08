package enumsExamples;

public class iceCream {
	enum Flava {
		CHOCOLATE, VANILLA, STRAWBERRY, CHEESECAKE;
	}

	public static void main(String[] args) {
		Flava flav = Flava.CHEESECAKE;
		
		if(flav == flav.CHEESECAKE) {
			System.out.println("It's cheesecake");
		} else if(flav == flav.CHOCOLATE) {
			System.out.println("It's chocolate");
		} else if (flav == flav.STRAWBERRY) {
			System.out.println("It's strawberry");
		} else if (flav == flav.VANILLA) {
			System.out.println("It's vanilla");
		}

	}

}
