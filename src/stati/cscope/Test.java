package stati.cscope;

import static stati.cscope.Employee.*;

/**
 * If you import static stuff from other class, you must use static keyword in import statement. That way, you don't
 * have to use class qualifier name
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println(getCount());
		System.out.println(count2);
	}
}
