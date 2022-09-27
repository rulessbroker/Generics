package com.bridgelabz;

public class FindMaximumNumbers {

	void getMax(Float f1, Float f2, Float f3, Float f4) {
		Float max = f1;
		if (f2.compareTo(max) > 0)
			max = f2;
		if (f3.compareTo(max) > 0)
			max = f3;
		if (f4.compareTo(max) > 0)
			max = f4;
		printMax(max);
	}

	private void printMax(Float value) {
		System.out.println("maximum= " + value);

	}

	public static void main(String[] args) {

		FindMaximumNumbers maximum = new FindMaximumNumbers();

		Float f1, f2, f3, f4;
		f1 = 5.1f;
		f2 = 6.2f;
		f3 = 10.5f;
		f4 = 2.35f;
		maximum.getMax(f1, f2, f3, f4);
	}
}
