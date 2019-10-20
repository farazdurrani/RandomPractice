package is.sorted.a.terminal.operation.or.intermediate.operation;

import java.util.Arrays;

public class SortedIsTerminalOperation {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		Arrays.stream(arr)
			.filter(n -> {
				System.err.println("Filter called on value ->" + n);
				return true;
			})
			.map(n -> {
				System.err.println("Map called on value ->" + n);
				return n;
			})
			.sorted() //SORTED IS TERMINAL OPERATION
			.map(n -> {
				System.err.println("Map called twice on value ->" + n);
				return n;
			})
			.count();
	}
}
