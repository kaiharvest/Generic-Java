package generic;

import java.util.Objects;

public class Person implements Comparable<Person> {
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Person o) {
		int cmpName = Objects.toString(this.name, "")
				.compareToIgnoreCase(Objects.toString(o.name, ""));
		if (cmpName != 0) return cmpName;
		return Objects.toString(this.address, "")
				.compareToIgnoreCase(Objects.toString(o.address, ""));
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', address='" + address + "'}";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Person)) return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(address, other.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, address);
	}
}
