package sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSort2 {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 6, 4, 1, 2 };
		System.out.println("Unsorted Array");
		IntStream.of(arr).forEach(System.out::print);
		System.out.println();
		int low = 0;
		int high = arr.length - 1;
		mergeSort(arr, low, high);
		System.out.println("Sorted Array");
		IntStream.of(arr).forEach(System.out::print);
	}

	private static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] A, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i] = A[low + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = A[mid + 1 + j];
		}
		
		System.out.print("Left Array: [");
		Arrays.stream(L).forEach(i -> System.out.print(i + ", "));
		System.out.println("]");
		System.out.print("Right Array: [");
		Arrays.stream(R).forEach(i -> System.out.print(i + ", "));
		System.out.println("]");

		int k = low;
		int i = 0;
		int j = 0;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			}
			else {
				A[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			A[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			A[k] = R[j];
			j++;
			k++;
		}

	}

}
