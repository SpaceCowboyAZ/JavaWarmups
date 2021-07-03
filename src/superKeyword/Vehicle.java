package superKeyword;

 class Vehicle {

	int maxSpeed = 133;
	
	public void honk() {
		System.out.println("honk!");
	
	}
	Vehicle() {
		System.out.println("Vehicle Constructor");
}

class Car extends Vehicle {
	int maxSpeed = 125;
	
	Car() {
		System.out.println("Car Constructor");
		super();
	}
	
	public void display() {
		System.out.println(super.maxSpeed);
	
	}
	
		
	public void honk() {
			System.out.println("beep beep");
			//calls from parents class
			super.honk();
			
	}
	
		
}
 }
	
