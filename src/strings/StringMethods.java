package strings;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String master = "Obi Won Kanobi";
		String notMaster = "Anakin Skywalker";
		
		
		System.out.println(master.charAt(2));
		System.out.println(master.toUpperCase());
		System.out.println(master.toLowerCase());
		System.out.println("unicode" + master.codePointBefore(2));
		System.out.println(master.concat(master));
		System.out.println(master.endsWith("z"));
		System.out.println(master.length());
		System.out.println(master.lastIndexOf(14));

		
		System.out.println(notMaster.toCharArray());
		System.out.println(master.startsWith("O"));
		System.out.println(notMaster.compareTo(master));
		
		//??
		System.out.println(notMaster.intern());
		
		System.out.println(master.replace("o", "i"));
		System.out.println(notMaster.substring(10));
		System.out.println(master.subSequence(3, 7));
}
}