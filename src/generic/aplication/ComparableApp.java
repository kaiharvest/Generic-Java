package generic.aplication;

import generic.Person;
import java.util.Arrays;

public class ComparableApp {
	public static void main(String[] args) {
		Person[] people = {
				new Person("Indra", "Cepu"),
				new Person("Budi", "Semarang"),
				new Person("Andi", "Solo")
		};

		Arrays.sort(people);
		System.out.println(Arrays.toString(people));
	}
}
