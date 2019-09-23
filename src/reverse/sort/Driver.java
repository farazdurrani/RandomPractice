package reverse.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

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

		Set<Person> set = new TreeSet<>(
			(Person per1, Person per2) -> per1.getAge() - per2.getAge()); // you cannot use .compareTo here
		. It can only
																			// be
																			// used on an object that implements
																			// Comparable
		Set<Person> set2 = new TreeSet<>(
			(Person per1, Person per2) -> per1.getName()
				.compareTo(per2.getName()));
	}

}
