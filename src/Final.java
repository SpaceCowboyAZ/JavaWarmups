package finalKeyWord;

public class Final {
	
	//good practice to have final all capital so it doesn't get confused with variables.
	final int MAX = 5;
	// won't work because final keeps max at 5.
//void changeMax(int newMax ) {
	///	MAX = newMax;
	
	public void sayHelloThere() {
		System.out.println("Hello there");
	}
	
	public static void main(String[] args) {
		Final f = new Final();
		System.out.println(f.MAX);
		f.sayHelloThere();
	}

}
