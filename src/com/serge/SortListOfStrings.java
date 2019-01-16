package com.serge;

import java.util.Arrays;

/*
 * Write Code To Sort The List Of Strings Using Java Collection?
 * 
 * 
 * 
 * */
public class SortListOfStrings {

	public static void main(String[] args) throws Exception {

		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "aug", "Sep", "Oct", "nov", "Dec"};

		// Display input un-sorted list.
		System.out.println("-------Input List-------");
		showList(inputList);

		// Call to sort the input list.
		Arrays.sort(inputList);

		// Display the sorted list.
		System.out.println("\n-------Sorted List-------");
		showList(inputList);

		// Call to sort the input list in case-sensitive order.
		System.out.println("\n-------Sorted list (Case-Sensitive)-------");
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

		// Display the sorted list.
		showList(inputList);

		// Display MANUALLY sorted list.
		System.out.println("\n------- MANUALLY Sorted List (Descending)-------");
		showList(sortArrayDesc(inputList));
	}

	private static String[] sortArrayDesc(String[] array) {
		String tempStr = null;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int index = array[i].compareToIgnoreCase(array[j]);
				if(index < 0) {
					tempStr = array[i];
					array[i] = array[j];
					array[j] = tempStr;
				}
			}
		}

		return array;
	}

	public static void showList(String[] array) {
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

}