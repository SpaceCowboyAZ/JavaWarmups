
public class ThisKeyword {

	int a;
	int b;
	
	public void setData(int a, int b) {
		//this keyword won't work with static
		this.a = a;
		this.b = b;
		
	}
		String shirtColor;
		char size;
	
	
		public void setShirt(String shirtColor, char size) {
			this.shirtColor = shirtColor;
			this.size = size;
			
	}
	public static void main(String[] args) {
		
		ThisKeyword k = new ThisKeyword();
		
		k.setData(4, 3);
		System.out.println(k.a);
		System.out.println(k.b);
		
		k.setShirt("Green", 's');
		System.out.println(k.size);
		System.out.println(k.shirtColor);

	}

}
