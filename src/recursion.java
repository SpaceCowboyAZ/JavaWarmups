
public class recursion {

	public static void main(String[] args) {
		sayHelloThere(6);
		
	}
	
	public static void sayHelloThere(int i) {
		//needs base case
		if(i == 0 ) {
			System.out.println("done");
		} else {
			System.out.println("Hello there");
			i--;
			sayHelloThere(i);
		}

	}

}
