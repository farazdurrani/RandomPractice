package random;

import java.util.Arrays;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("dog", "over", "good");
		list.stream().reduce((x1,x2) -> x1.length() ==3 ? x1:x2).ifPresent(System.out::println);
		
	}

}
