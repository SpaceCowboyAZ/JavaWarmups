package inheritance;

public class Main {

	public static void main(String[] args) {
		Guitar1 g1 = new Guitar1();
		
		g1.tuneUp();
		g1.tuneDown();
		g1.Strings();

		g1.connect();
		
		guitar2 g2 = new guitar2();
		
		g2.tuneUp();
		g2.tuneDown();
		g2.Strings();
	
		
		guitar3 g3 = new guitar3();
		
		g3.tuneUp();
		g3.tuneDown();
		g3.Strings();
	
	}

}
