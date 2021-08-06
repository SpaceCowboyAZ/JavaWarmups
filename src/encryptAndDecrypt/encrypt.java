package encryptAndDecrypt;

public class encrypt {

	public static void main(String[] args) {
		
		int key = 5;
		String s = "Hello there";
		String st = "Mjqqt%ymjwj";
		char[] chars = s.toCharArray();
		
		for(char c : chars) {
			
			//encrypts string by taking each char element in the string and adding 5. so a would go to f
			c += key;
			
			//decrypts key will take f down to a
			//c -= key;
			System.out.print(c);
			
		}
		
		

	}

}
