package reverse.sort;

import java.util.Arrays;
import java.util.Collections;

public class Driver {
	public static void main(String[] args) {
		Person p1 = new Person("saad", 1922);
		Person p2 = new Person("faraz", 1910);
		Person[] persons = { p1, p2 };

		System.out.println("Sorting by age (implemented by Comparable)");
		Collections.sort(Arrays.asList(persons));
		for (Person person : persons) {
			System.out.print(person + " ");
		}
		System.out.println();
		System.out.println("Before Sorting by name");
		for (Person person : persons) {
			System.out.print(person + " ");
		}
		System.out.println();
		System.out.println("After Sorting by name");
		Collections.sort(Arrays.asList(persons), new PersonComparator());
		for (Person person : persons) {
			System.out.print(person + " ");
		}
		System.out.println();
		System.out.println("Reverse Sorting by name");
		Collections.sort(Arrays.asList(persons), new PersonReverseComparator());
		for (Person person : persons) {
			System.out.print(person + " ");
		}
		System.out.println();
	}

}
