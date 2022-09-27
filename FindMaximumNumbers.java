package com.bridgelabz;

public class FindMaximumNumbers<K extends Comparable<K>> {

	void getMax(K n1, K n2, K n3, K n4) {
		K max = n1;
		if (n2.compareTo(max) > 0)
			max = n2;
		if (n3.compareTo(max) > 0)
			max = n3;
		if (n4.compareTo(max) > 0)
			max = n4;
		printMax(max);
	}

	void printMax(K value) {
		System.out.println("maximum= " + value);
	}

	public static void main(String[] args) {

		FindMaximumNumbers<String> maximum = new FindMaximumNumbers<String>();

		String s1, s2, s3, s4;
		s1 = "Apple";
		s2 = "Peach";
		s3 = "Banana";
		s4 = "Mango";
		maximum.getMax(s1, s2, s3, s4);
	}
}
