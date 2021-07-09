package queues;

import java.util.LinkedList;
import java.util.Queue;

public class videoGameQueueExample {

	public static void main(String[] args) {
	
		Queue<String> games= new LinkedList();
		games.add("Red Dead");
		games.add("Dead Space");
		games.add("Halo");

		// removes head in the queue		
		//games.poll();
		
		System.out.println(games.contains("Red Dead"));
		
System.out.println(games.size());
System.out.println(games.toArray()[2]);

}
}