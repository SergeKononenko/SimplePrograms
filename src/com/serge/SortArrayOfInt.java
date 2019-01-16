package com.serge;

public class SortArrayOfInt {

	public static void main(String[] args) {

		int[] numbers = { 9, 8, 7, 6, 5 };
		int tempVar;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					tempVar = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = tempVar;
				}
			}
			
			for (int k = 0; k < numbers.length; k++) {
				System.out.print(numbers[k] + ", ");
			}
			System.out.println("");

		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
