package sort;

import java.util.stream.IntStream;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 6, 4, 1, 2 };
		int low = 0;
		int high = arr.length - 1;
		mergesort(arr, low, high);

		IntStream.of(arr)
			.forEach(System.out::print);

	}

	private static void mergesort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergesort(arr, low, mid);
			mergesort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}

	}

	private static void merge(int[] A, int low, int mid, int high) { // arr, 0, 2 , 5

		System.out.println("Merge Method called with ");
		IntStream.of(A)
			.forEach(System.out::print);
		System.out.println();
		System.out.println("Low: " + low + ". Mid: " + mid + ". High: " + high);
		int n1 = mid - low + 1; // 4 - 0 + 1 = 5 // 2 - 0 + 1 = 3
		int n2 = high - mid; // 8 - 3 = 4 // 5 - 2 = 3

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = A[low + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = A[mid + 1 + j];
		}

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
