package lec10_01_java_conditional_statements;

import java.util.Random;
import java.util.Scanner;

public class CompareNumber12 {

	public static void main(String[] args) {
		// Random class is used
		System.out.println("---: Please put number belows :---");
		Random random = new Random();
		int val1 = random.nextInt(1000);
		int val2 = random.nextInt(1000);
		
		if (val1 % 2 ==0) { // outer if block
			// inner if block
			if (val1 < val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is less than " + val2);
			} else if (val1 > val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is greter than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is greter than or equal to " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is less than or equal to " + val2);
			}
					
		} else if (val1 % 2 ==1) { // outer if block
			// inner if block
			if (val1 < val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is less than " + val2);
			} else if (val1 > val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is greter than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is equal to " + val2);
			}  else if (val1 >= val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is greter than or equal to " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is less than or equal to " + val2);
			} 
					
		} else {
			System.out.println("The system failed to execute your order");
		}
		
	}

}
