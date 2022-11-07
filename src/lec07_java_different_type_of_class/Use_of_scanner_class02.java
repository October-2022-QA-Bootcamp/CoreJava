package lec07_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class02 {

	public static void main(String[] args) {
		System.out.println("Please put values below: ");
		Scanner scanner = new Scanner(System.in); // this Scanner class allow me to write in the console
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		int val3 = scanner.nextInt();		
		int total = val1 + val2 + val3;
		System.out.println("\nThe sum of the val1, 2 and 3 is: " + total);
		scanner.close();
	}

}
