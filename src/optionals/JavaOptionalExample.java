package optionals;

import java.util.Optional;

public class JavaOptionalExample {

	public static void main(String[] args) {
		
		Optional<String> empty = Optional.empty(); //empty is variable
		System.out.println(empty.isPresent()); //false
		System.out.println(empty.isEmpty()); //true
		
		
		// Optional<String> void1 = Optional.of(null); // will not work because Optional.of expects a valuable. throws no pointer exception
		
		Optional<String> void1 = Optional.of("Hello there");
		System.out.println(void1.isPresent()); //true
		System.out.println(void1.isEmpty()); //false
		
		String or = void1.orElse("General Kenobi"); //void1 has a value so won't do anything
		System.out.println(or);
		
		
		Optional<String> hello = Optional.ofNullable(null);
		String orElse = empty
				.map(String::toUpperCase)
				.orElseThrow(IllegalStateException::new);
				
		System.out.println(orElse);
		
		
			
		
	}

}
