package arrays.aslist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArraysAsListAndListToArray {
	public static void main(String[] args) {
		String[] colors = { "blue", "yellow", "white" };
		// this returns a unmodifiable list.
		// meaning you cannot add or substract elements from the list.
		// but you can still make changes to the elements inside them.
		// which will also reflect back to original array as seen below.
		List<String> list = Arrays.asList(colors);
//		list.add("purple"); throws an error UnsupportedOperationException
		System.out.println("before change: " + list);

		list.set(0, list.get(0)
			.toUpperCase());

		System.out.println("after change list\n" + list);

		System.out.println("after change array");

		for (String string : colors) {
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println("done");

		list = new LinkedList<>(Arrays.asList(colors));
		list.add("purple"); // this is allowed because we are making a change to a new list
		System.out.println(list);
		String arr2[] = list.toArray(new String[list.size()]);
//		String[] arr3 = (String[]) list.toArray(); //this is not allowed.
		Object[] arr3 = list.toArray();
		for (String string : arr2) {
			System.out.println("-" + string);
		}

		for (Object obj : arr3) {
			System.out.println("--" + (String) obj);
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr2[i].toUpperCase(); // this wouldn't change the list, which is what we want.
		}
		for (String string : arr2) {
			System.out.println("-" + string);
		}
		System.out.println(list);
		// arr4 will still hold same numbers of elements as list even though we created a smaller String array.
		// toArray method will create a NEW array behind the scenes and copy over elements to this newly created array.
		String arr4[] = list.toArray(new String[list.size() - 1]);
		for (String string : arr4) {
			System.out.println("-" + string);
		}
		System.out.println("----");
		// arr5 will have it's last element filled with nulls
		String arr5[] = list.toArray(new String[list.size() + 7]);
		for (String string : arr5) {
			System.out.println("-" + string);
		}
		System.out.println(arr5.length);
		System.out.println("before sorted: ");
		for (String string : colors) {
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println(" after Sorted ");
		Collections.sort(Arrays.asList(colors));
		for (String string : colors) {
			System.out.print(string + " ");
		}
		System.out.println();
	}
}
