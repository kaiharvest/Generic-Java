package generic.aplication;

import generic.MyData;

public class Covariant {
	public static void main(String[] args) {

		MyData<String> stringMyData = new MyData<>("Indra");
		process(stringMyData);

		MyData<? extends Object> myData = stringMyData;

	}

	public static void process(MyData<? extends Object> myData) {
		System.out.println(myData.getData());
		// System.out.println(myData.setData(); // ERROR

		// myData.setData(1); // ridak boleh, karena berbahaya
	}

}
