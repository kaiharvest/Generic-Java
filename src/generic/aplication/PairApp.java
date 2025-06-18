package generic.aplication;

import generic.Pair;

public class PairApp {
	public static void main(String[] args) {

		Pair<String, Integer> data = new Pair<>("Indra Dwi Prabowo", 22);

		System.out.println(data.getFirst());
		System.out.println(data.getSecound());

	}
}
