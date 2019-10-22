package regular.expression.practice;

public class Main {
	public static void main(String[] args) {
		
		// regular expression works on a single character. 
		// You define yourself by using square brackets [] 
		// or use preexisting character classes like 
		// \w (any word character like any letter (lower or upper case), digits, and underscore, 
		// \s (any space, tab, carriage return, newline or a form feed, 
		// \d (any digit only)
		
		// * means 0 or more occurences
		// + means 1 or more occurences
		// ? means 0 or 1 occurences
		// {n} means exactly n occurences
		// {n,} means at least n occurences
		// {n,m} means matches between n amd m (inclusive) occurences
		
		
		
		String digits = "1234";
		if(digits.matches("\\d+")) { //must place * or +
			System.err.println("digits only");
		} else {
			System.err.println("not just digits");
		}
		
		String vowels = "aeiou";
		if(vowels.matches("[aeiou]")) { //this matches a single character because of lack of * or +. No the whole thing
			System.err.println("Vowels");
		} else {
			System.err.println("Not vowels ");
		}
		
		if(vowels.matches("[aeiou]+")) { //this matches the whole thing because of the * or +
			System.err.println("Vowels");
		} else {
			System.err.println("Not vowels ");
		}
	}
}
