package regular.expression.practice;

public class ReplacePractice {
	public static void main(String[] args) {
		String source = "{ faraz: { one: two } }";
		
		String replaced1 = source.replace("{ faraz: ", "");
		String replaced2 = replaced1.substring(0, replaced1.lastIndexOf("}"));
		
		System.out.println(replaced2);
	}
}
