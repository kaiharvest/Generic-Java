package generic.aplication;

import generic.util.ArrayHelper;

public class ArrayHelperApp {
	public static void main(String[] args) {

		ArrayHelper arrayHelper = new ArrayHelper();

		String[] names = {"indra", "joko", "budi"};
		Integer[] numbers = {10, 40, 33, 98, 30};

		System.out.println(ArrayHelper.count(names));
		System.out.println(ArrayHelper.count(numbers));

	}
}
