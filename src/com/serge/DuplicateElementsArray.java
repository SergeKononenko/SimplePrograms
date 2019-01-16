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

		ArrayList<String> list = new ArrayList<String>();

		// Form a list of numbers from 0-9.
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}

		// Insert a new set of numbers from 0-5.
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("Input list : " + list);
		System.out.println("\nFiltered duplicates : " + findDuplicates(list));
	}

	public static Set<String> findDuplicates(List<String> listContainingDuplicates) {

		 Set<String> resultSet = new HashSet<String>(); // Using HashSet because it does not contain duplicates, order is not important
		 Set<String> tempSet = new HashSet<String>();

		for (String yourInt : listContainingDuplicates) {
			if (!tempSet.add(yourInt)) { //the value will be added to the set if only it does not already contain one
				resultSet.add(yourInt);
			}
		}
		return resultSet;
	}
}
