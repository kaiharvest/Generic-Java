package generic.aplication;

import generic.MyData;

public class MyDataApp {
	public static void main(String[] args) {

		MyData<String> myDataString = new MyData<String>("Indra");
		MyData<Integer> myDataInteger = new MyData<Integer>(100);

		System.out.println(myDataString.getData());
		System.out.println(myDataInteger.getData());

	}
}
