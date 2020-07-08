package chars.practice;

public class CharPrac {
	public static void main(String[] args) {
		String name = "Faraz Sarwar";
//		for (int i = 0; i < name.length(); i++) {
//			System.out.println("char at " + i + ": " + name.charAt(i));
//		}
		for (int i = name.length() -1 ; i > -1; i--) {
//			System.out.println("char at " + i + ": " + name.charAt(i));
			System.out.print(name.charAt(i));
		}
		
	}
}
