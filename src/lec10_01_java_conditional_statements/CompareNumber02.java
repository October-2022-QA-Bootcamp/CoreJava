package lec10_01_java_conditional_statements;

/*
Conditional Statement:
Conditional Statements allow the program to behave differently based on condition. 
Below keywords are used
Example: if, else, else if, switch. 
Regarding condition: First condition we have to always use 'if' keyword.
Generally we don't use - 2 if condition (code wise OK), 
rather we use 'if' as first condition and 'else or else if' as second condition. 
Generally the true statement is written at the end.
When we write 'else' keyword, no condition is necessary to write,
Whatever you want to print, it will be printed in else block. either it is true or false, correct or incorrect, it doesn't matter
 */

public class CompareNumber02 {

	public static void main(String[] args) {
		int val1 = 67;
		int val2 = 23;
		
		if (val1 < val2) { // inside the () -- condition is present, if condition is true then this if block will be executed
			System.out.println(val1 + " is less than " + val2);
		} else {
			System.out.println(val1 + " is greater than " + val2);
		}
		
		
		
		

	}

}
