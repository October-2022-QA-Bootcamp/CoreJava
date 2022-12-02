package lec19_01_java_read_and_write;

public class A_when_to_use_try_catch_block {

	public static void main(String[] args) {
		int a = 12;
		int b = 0;
		int division = a/b;
		System.out.println(division);		
		
		// From Line 12, codes are not executing, although compilation is correct	
		int addition = a + b;
		System.out.println("The addition of a and b is: " + addition);

	}

}
