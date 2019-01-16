package com.serge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
 * Write Code To Filter Duplicate Elements From An Array And Print As A List?
 * 
 * */

public class DuplicateElementsArray {

	public static void main(String[] args) {

		String[] arr = {"cat", "dog", "cat"};
		ArrayList<String> list = new ArrayList<String>();

		// Form a list of numbers from 0-9.
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}

		// Insert a new set of numbers from 0-5.
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("Input list1 : " + list);
		System.out.println("\nFiltered duplicates by HashSet : " + findDuplicatesHashSet(list));
		System.out.print("\nInput list2 : ");
		printArray(arr);
		System.out.println("\n\nFiltered duplicates manually : " + findDuplicatesInArr(arr));
	}

	public static Set<String> findDuplicatesHashSet(List<String> listContainingDuplicates) { // Using HashSet

		 Set<String> resultSet = new HashSet<String>(); // Using HashSet because it does not contain duplicates, order is not important
		 Set<String> tempSet = new HashSet<String>();

		for (String yourInt : listContainingDuplicates) {
			if (!tempSet.add(yourInt)) { //the value will be added to the set if only it does not already contain one
				resultSet.add(yourInt);
			}
		}
		return resultSet;
	}
	
	public static ArrayList<String> findDuplicatesInArr(String[] arrayContainingDuplicates) {

		ArrayList<String> resultSet = new ArrayList<String>(); 
		
		for (int i = 0; i<arrayContainingDuplicates.length; i++) {
			for(int j = i+1; j<arrayContainingDuplicates.length; j++) {
				if(arrayContainingDuplicates[i].equals(arrayContainingDuplicates[j]))
					resultSet.add(arrayContainingDuplicates[i]);
			}
		}
		return resultSet;
	}
	
	public static void printArray(String[] arr) {
		for(String str : arr)
		System.out.print( str + ", ");
	}
	
}













