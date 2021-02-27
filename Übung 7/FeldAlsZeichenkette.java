public class FeldAlsZeichenkette {
	
	static String asString(char[] a) {
		
		String word = "";
		
		if (a == null);
		if (a.length <= 0);
		
		for(int i = 0; i < a.length; i++) {
			word += a[i];
		}
		return word;
	}
		
	public static void main(String[]args) {
		
		char[] a = new char[] {};
		Out.println(asString(a));
	}
}
