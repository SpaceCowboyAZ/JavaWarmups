package hashSets;

import java.util.HashSet;
import java.util.Iterator;

public class hashSets {

	public static void main(String[] args) {
	
		
		HashSet h = new HashSet();
		h.add("Fender");
		h.add("Gibson");
		h.add("Jackson");
		h.add("ESP");
		
		System.out.println(h.contains("Squire"));
		
		HashSet<Integer> ints = new HashSet<Integer>();
		ints.add(44);
		ints.add(23);
		ints.add(65);
		
		
		
		System.out.println(ints);
		
		//can't rely on order in hashsets/maps
		Object[] o = ints.toArray();
		System.out.println(o[0]);
		
		
		// prints jibberish
		//System.out.println(ints.toArray());
		
		Iterator<Integer> it = ints.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
