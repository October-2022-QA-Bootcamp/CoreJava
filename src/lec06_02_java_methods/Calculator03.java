package lec06_02_java_methods;

public class Calculator03 {
	// global variable or class variable
	float a = 1.34f;
	float b = 3.22f;

	// return type method
	public float multiplication() {
		float total1 = a * b; // local variable
		System.out.println("Multiplication of a and b is: " + total1);
		return total1;
	}

	// learning something new
	// return type and parameterized type method
	public float division(float c, float d) { // parameter
		float total2 = c / d; // local variable
		System.out.println("Division of c and d is: " + total2);
		return total2;
	}
	
	public float addition (float a, float b) { // parameter
		// Like constructor, we don't need to use this keyword to make a relation between variables and parameter inside method
		float total3 = a+b; // local variable
		System.out.println("Addition of a and b is: " + total3);
		return total3;
	}

}
