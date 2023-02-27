package lec80_java_coding_challenge;

public class A06_ConvertSumOfTwoNumbersToAReverseString {
	public static void main(String[] args) {

	    int firstNumber = 100;
	    int secondNumber = 200;

	    int result = firstNumber + secondNumber;
	    // Conversion from int to String
	    String str = String.valueOf(result);
	    System.out.println("Sum of Two Numbers as String: " + str);
	    
	    String reverseString = "";
	    for (int i = str.length() - 1; i >= 0; i--) {
	      reverseString = reverseString + str.charAt(i);
	    }
	   System.out.println("Reverse string: " + reverseString);
	    
	  }

}
