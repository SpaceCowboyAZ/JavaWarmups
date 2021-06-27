package strings;

public class reverseString {

	public static void main(String[] args) {
	 
		String a = reverse("reverse");
		System.out.println(a);
		
	}
	
	public static String reverse(String b) {
		char[] letters = new char[b.length()];
		
		int letterIndex = 0;
		for (int i = b.length() - 1; i >= 0; i--) {
		letters[letterIndex] = b.charAt(i);
		letterIndex++;
	}

	String reverse = "";
			for(int i = 0; i < b.length(); i++) {
				reverse = reverse + letters[i];
			}

return reverse;

}
}