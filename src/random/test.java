package random;

import java.util.StringJoiner;

public class test {
public static void main(String[] args) {
	StringBuilder builder = new StringBuilder("Wellcome everybody");
	StringJoiner joiner = new StringJoiner(" ", "H", "?");
	builder.replace(0,7,"elcome");
	builder.setCharAt(7, '!');
	joiner.add("ello and").add(builder);
	System.out.println(joiner.toString());
}
}
