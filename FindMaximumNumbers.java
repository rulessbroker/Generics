package com.bridgelabz;

public class FindMaximumNumbers {

	void getMax(String s1, String s2, String s3, String s4) {
		String max = s1;
		if (s2.compareTo(max) > 0)
			max = s2;
		if (s3.compareTo(max) > 0)
			max = s3;
		if (s4.compareTo(max) > 0)
			max = s4;
		printMax(max);
	}

	private void printMax(String value) {
		System.out.println("maximum= " + value);

	}

	public static void main(String[] args) {

		FindMaximumNumbers maximum = new FindMaximumNumbers();

		String s1, s2, s3, s4;
		s1 = "Apple";
		s2 = "Peach";
		s3 = "Banana";
		s4 = "Mango";
		maximum.getMax(s1, s2, s3, s4);
	}
}
