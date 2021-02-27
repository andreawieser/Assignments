public class Verschluesselung {
	
	static String encrypt(String text, int key) {
		
		if (text.length() == 0) return "";
		if (key <= 0) return "";
		
		String encrypted = "";
		
		for (int i = 0; i < text.length(); i++) {
			
			char shifted = text.charAt(i);
			encrypted = encrypted + shift(shifted, key);
		}
		return encrypted;
	}
	static String decrypt(String text, int key) {
		
		if (text.length() == 0) return "";
		if (key <= 0) return "";
		
		String decrypted = "";
		
		for (int i = 0; i < text.length(); i++) {
			
			char shifted = text.charAt(i);
			decrypted = decrypted + shift(shifted, 26 - key);
		}
		return decrypted;
	}
	static char shift(char character, int key) {
		
		if (character >= 'a' && character <= 'z') {
			character += key;
			while (character > 'z') {
				character -= 26;
			}
		}
		return character;
	}
	public static void main (String[] args) {
		
		String s = "das ist ein text";
		Out.println(s);
		String encrypted = encrypt(s, 3);
		Out.println(encrypted); 
		String original = decrypt(encrypted, 3);
		Out.println(original);
	}
}
