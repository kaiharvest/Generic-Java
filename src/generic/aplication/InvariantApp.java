package generic.aplication;

import generic.MyData;

public class InvariantApp {
	public static void main(String[] args) {

		MyData<String> stringMyData = new MyData<>("Indra Dwi");
		// MyData<String> stringMyData = new MyData<>("indra"); // ERROR
		// doIt(stringMyData); // ERROR

		MyData<Object> objectMyData = new MyData<>(1000);
		// MyData<Integer> integerMyData = objectMyData; // ERROR
		// doItInteger(objectMyData); // ERROR

	}

	public static void doIt(MyData<Object> objectMyData) {
		// do nothing
	}

	public static void doItInteger(MyData<Integer> integerMyData) {
		// do nothing
	}

}
