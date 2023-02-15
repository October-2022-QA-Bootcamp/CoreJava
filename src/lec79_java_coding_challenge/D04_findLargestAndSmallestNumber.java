package lec79_java_coding_challenge;

public class D04_findLargestAndSmallestNumber {

	public static void main(String[] args) {
		int [] number = {12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 44, 12, 1456, 1, 6, 4, 5, 5 };
		
		int smallest = number [0];
		int largest = number [0];
		
		for (int i = 1; i < number.length; i++) {
			if (number[i]<smallest) {
				smallest = number [i];
			} else if (number[i] > largest) {
				largest = number[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
		
		
		
		
		
		

	}

}
