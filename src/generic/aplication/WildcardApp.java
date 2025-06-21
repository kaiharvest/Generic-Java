package generic.aplication;

import generic.MyData;

public class WildcardApp {
	public static void main(String[] args) {

		printLenghth(new MyData<>("Indra"));
		printLenghth(new MyData<>(100));
		printLenghth(new MyData<>(true));

	}

	public static void printLenghth(MyData<?> data) {
		System.out.println(data.getData());
	}

}
