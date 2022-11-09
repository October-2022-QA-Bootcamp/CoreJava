package lec10_01_java_conditional_statements;

import java.util.Scanner;

public class CompareNumber08 {

	public static void main(String[] args) {
		System.out.println("---: Please put number belows :---");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		if (val1 % 2 ==0 || val1 < val2) {
			System.out.println(val1 + " is an even number or " + val1 + " is less than " + val2);
		} else if (val1 % 2 ==1 || val1 < val2) {
			System.out.println(val1 + " is an odd number or " + val1 + " is less than " + val2);
		} else if (val1 % 2 ==0 || val1 > val2) {
			System.out.println(val1 + " is an even number or " + val1 + " is greter than " + val2);
		} else if (val1 % 2 ==1 || val1 > val2) {
			System.out.println(val1 + " is an odd number or " + val1 + " is greter than " + val2);
		}	else {
			System.out.println("The system failed to execute your order");
		}
		scanner.close();
	}

}
