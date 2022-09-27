package com.bridgelabz;

public class FindMaximumNumbers {

	void getMax(Integer n1, Integer n2, Integer n3, Integer n4) {
		Integer max = n1;
		if (n2.compareTo(max) > 0)
			max = n2;
		if (n3.compareTo(max) > 0)
			max = n3;
		if (n4.compareTo(max) > 0)
			max = n4;
		printMax(max);
	}

	void printMax(int value) {
		System.out.println("maximum= " + value);
	}

	public static void main(String[] args) {

		FindMaximumNumbers maximum = new FindMaximumNumbers();

		Integer num1, num2, num3, num4;
		num1 = 5;
		num2 = 9;
		num3 = 7;
		num4 = 3;
		maximum.getMax(num1, num2, num3, num4);
	}
}
