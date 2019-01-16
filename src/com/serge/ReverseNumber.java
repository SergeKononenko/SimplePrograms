package com.serge;

public class ReverseNumber {

	public static void main(String[] args) {
		
		long lnum = 65432;
		ReverseNumber input = new ReverseNumber();

		System.out.println("Input value : " + lnum);
		System.out.println("Inverted value : " + input.doInvert(lnum));

	}

	
	public long doInvert(long number) {

		long invert = 0;
		while (number != 0) {
			invert = (invert * 10) + (number % 10);
			number = number / 10;
		}
		return invert;
	}
}
