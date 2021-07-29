
public class findDuplicates {

	public static void main(String[] args) {
		String sentence = "How many duplicatates are there?";
		System.out.println(sentence);
		
		String characters = "";
		String duplicates = "";
		
		for (int i = 0; i < sentence.length(); i ++) {
			String current = Character.toString(sentence.charAt(i));
			if(characters.contains(current)) {
				if (!duplicates.contains(current)) {
			duplicates += current + " , ";
			}
			}
			characters += current;
			
//			characters += sentence.charAt(i);
////			System.out.println(sentence.charAt(i));
//			System.out.println(characters);
		}
		System.out.println(duplicates);
	}
	
	}

