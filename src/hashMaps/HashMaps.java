package hashMaps;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 13;
		int c = 44;
		
		HashMap<String, Integer> ints = new HashMap<String, Integer>();
		ints.put("a", 10);
		ints.put("b", 13);
		ints.put("c", 44);
		System.out.println(ints);
		System.out.println(ints.get("c"));
		
		
		
		HashMap<String, String> users = new HashMap<String, String>();
		users.put("cheeseLover123", "password123");
		users.put("TheUserWithNoName", "yeehaw789");
		users.put("bobbyjoe123", "anotherPassword123");
		
		//values are on the right, keys on the left
		System.out.println(users.containsValue("password123"));
		System.out.println(users.containsKey("password123"));
		
		System.out.println(users.containsKey("TheUserWithNoName"));
		System.out.println(users.containsValue("TheUserWithNoName"));
		
		users.replace("TheUserWithNoName", "anotherPassword");
		users.remove("bobbyjoe123");
		System.out.println(users);
		
		//access all the values
		System.out.println(users.values());
		
		//access all the keys
		System.out.println(users.keySet());
	}

}
