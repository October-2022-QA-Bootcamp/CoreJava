package lec16_01_java_oop_polymorphism;

public class ModernCalculator extends LandCalculator {
	
	// return type parameterized method -01 implemented
	@Override
	public int landCalculator (int a, int b, int c) {
		int total1 = a+b+c+20;
		System.out.println("Total area from local Calculator: " + total1);
		return total1;
	}
	
	// return type parameterized method -02 implemented
	@Override
	public int landCalculator (int d, int e, float f) {
		int total2 = d/2 + e + (int) f;
		System.out.println("Total area from local Calculator: " + total2);
		return total2;
	}
	
	// return type parameterized method -03 implemented
	@Override
	public int landCalculator (int a, int b) {
		int total3 = a+b*3;
		System.out.println("Total area from local Calculator: " + total3);
		return total3;
	}
	
	// Return type parameterized method implemented -04
	@Override
	public int landCalculator (int d, int e, String f) {
		int total4 = d + e + Integer.parseInt(f) - 6;
		System.out.println("Total area from local Calculator: " + total4);
		return total4;
	}
	
	// Return type parameterized method implemented -05
	@Override
	public int landCalculator (int d, String e, int f) {
		int total5 = 2*d + Integer.parseInt(e) + f;
		System.out.println("Total area from local calculator: " + total5);
		return total5;
	}
	
	
	
	// Return type parameterized method which is final and implemented
	// Final type method cannot be Overriden -- important interview question
	// Cannot override the final method from LandCalculator
	
	/*
	@Override
	public final int landCalculator (int a, int b, int c, int d) {
		int total6 = a + b + c + d;
		System.out.println("Total area from local calculator: " + total6);
		return total6;
	}
	*/
	
	// Static type Method (7) implemented
	// -- important interview question
	// This below method - landCalculator can't override or implemented
	// because static is a local member method of a class)
	// So, static method can't be override, if we remove @override it will work as
	// static method of this modern calculator class	
	
	/*
	@Override
	public static int landCalculator (int a, int b, int c, int d, int e) {
		int total7 = a + b + c + d + e;
		System.out.println("Total area from local calculator: " + total7);
		return total7;
	}
    */
	
	// void type no argument method (8) is implemented
	@Override
	public void landCalculator () {
		System.out.println("This is from void type method from Modern Calculator");
	}
	
	// void type parameterized method (9) is implemented
	@Override
	public void landCalculator (int a, int b, int c, int d, int e, int f) {
		int total8 = 5*a + b/2 + c/3 + d + e+f -25;
		System.out.println("Total area from local calculator: " + total8);
	}
	

}
