package generic.aplication;

import generic.MyData;

public class ContravariantApp {
	public static void main(String[] args) {

		MyData<Object> objectMyData = new MyData<>("Indra");
		// objectMyData.setData(100); // ERROR

		proses(objectMyData);

		System.out.println(objectMyData.getData());

	}

	public static void proses(MyData<? super String> myData) {
		String value = (String) myData.getData(); // ini sangat berbahaya
		System.out.println("Process parameter: " + value);

		myData.setData("Eko");

	}

}
