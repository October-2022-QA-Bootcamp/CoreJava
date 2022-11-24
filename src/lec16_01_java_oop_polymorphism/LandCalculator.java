package lec16_01_java_oop_polymorphism;

public class LandCalculator {
	
	// return type parameterized method -01 implemented
	// if you write like (int c, int b, int a) in a separate method or like (int d, int e, int f) ,
	// it will not work like parameterized constructor.
	// same variable type is the problem, how many variables, this is not an issue
	// it allows the same number of variable, if variables type are different as parameter in a different combination
	public int landCalculator (int a, int b, int c) {
		int total1 = a+b+c;
		System.out.println("Total area from local Calculator: " + total1);
		return total1;
	}
	
	// return type parameterized method -02 implemented
	// but here one of the signature/parameter is float Type
	// line 10 vs 20, although number of parameter same, but parameter type is different
	// same number of parameter, same type of parameter is not allowed
	public int landCalculator (int d, int e, float f) {
		int total2 = d + e + (int) f;
		System.out.println("Total area from local Calculator: " + total2);
		return total2;
	}
	
	// return type parameterized method -03 implemented
	public int landCalculator (int a, int b) {
		int total3 = a+b;
		System.out.println("Total area from local Calculator: " + total3);
		return total3;
	}
	
	// Return type parameterized method implemented -04
	public int landCalculator (int d, int e, String f) {
		int total4 = d + e + Integer.parseInt(f);
		System.out.println("Total area from local Calculator: " + total4);
		return total4;
	}
	
	// Return type parameterized method implemented -05
	// Please compare line 34 and 42
	public int landCalculator (int d, String e, int f) {
		int total5 = d + Integer.parseInt(e) + f;
		System.out.println("Total area from local calculator: " + total5);
		return total5;
	}
	
	// Return type parameterized method which is final implemented -06
	// Also called final method, final method can't be changed
	// Final type of method can be overloaded -- important interview question
	public final int landCalculator (int a, int b, int c, int d) {
		int total6 = a + b + c + d;
		System.out.println("Total area from local calculator: " + total6);
		return total6;
	}
	
	// Static type Method (7) implemented
	// Static method can be overloaded -- important interview question
	public static int landCalculator (int a, int b, int c, int d, int e) {
		int total7 = a + b + c + d + e;
		System.out.println("Total area from local calculator: " + total7);
		return total7;
	}

	// void type no argument method (8) is implemented
	public void landCalculator () {
		System.out.println("This is from void type method from Local Calculator");
	}
	
	// void type parameterized method (9) is implemented
	public void landCalculator (int a, int b, int c, int d, int e, int f) {
		int total8 = a + b + c + d + e+f;
		System.out.println("Total area from local calculator: " + total8);
	}
	

}
