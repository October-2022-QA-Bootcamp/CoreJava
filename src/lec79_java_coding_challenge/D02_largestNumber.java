package lec79_java_coding_challenge;

import java.util.Arrays;

//Que: To Raihan, Can you find the second largest number from the Array

public class D02_largestNumber {
	// This is not accepted by interviewer ( so try to avoid it)
	public static void main(String[] args) {
		int [] number = { 12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 2, 44, 12, 1456, 6, 4, 5, 5 };
		// Arrays class is used to manipulate the Array
		System.out.println("Unsorted Array ::> " + Arrays.toString(number)); // no need
		// This below line is used to see the index of the Array in ascending order
		Arrays.sort(number);
		System.out.println("Sorted Array ::> " + Arrays.toString(number)); // no need
		System.out.println("Smallest element is ::>" + number[0]);
		System.out.println("Largest element is ::>" + number[number.length-1]);
		System.out.println("Second Largest element is ::>" + number[number.length-2]);
	
	}

}