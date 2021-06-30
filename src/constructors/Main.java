package constructors;

import inheritance.Guitar;

public class Main {

	public static void main(String[] args) {
		guitar g = new guitar("Black", 24.5);
		
		
		g.setColor("Black");
		g.setSize(24.5);
		g.putOn();
		
		System.out.println(g.color);
		System.out.println(g.size);
	}

}
