package insertion.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 6, 4, 1, 2 };
		Arrays.stream(arr)
			.forEach(System.out::print);
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j > -1 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println();
		IntStream.of(arr)
			.forEach(System.out::print);

	}
//	public static void main(String[] args) {
//		int[] arr = { 5, 3, 6, 4, 1, 2 };
//		Arrays.stream(arr).forEach(System.out::print);
//		for (int i = 1; i < arr.length; i++) {
//			int currKey = arr[i];
//			int j = i - 1;
//			while (j > -1 && arr[j] > currKey) {
//				arr[j+1] = arr[j];
//				j--;
//			}
//			arr[j + 1] = currKey;
//		}
//		System.out.println();
//		IntStream.of(arr).forEach(System.out::print);
//
//	}
//	int[] arr = { 5, 3, 6, 4, 1, 2 };
//	Arrays.stream(arr).forEach(System.out::print);
//	for (int i = 1; i < arr.length; i++) {
//		int key = arr[i];
//		int j = i - 1;
//		while (j > -1 && arr[j] > key) {
//			arr[j+1] = arr[j];
//			j--;
//		}
//		arr[j+1] = key;
//	}
//	System.out.println();
//	IntStream.of(arr).forEach(System.out::print);
}
