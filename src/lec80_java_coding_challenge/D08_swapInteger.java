package lec80_java_coding_challenge;

public class D08_swapInteger {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		System.out.println("The valus of x is: " + x);
		System.out.println("The valus of y is: " + y);
		
		// using ^ operator (also called caret or xor symbol)
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.println("After swap, The valus of x is: " + x);
		System.out.println("After swap, The valus of y is: " + y);
		
	}

}
