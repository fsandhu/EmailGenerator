package emailApp;

public class RandomPassGenerator {
	
	public static String randomPass(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWX"
				+ "YZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0 ; i < length ; i++) {
			int random = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
}
