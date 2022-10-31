package lec06_02_java_methods;

public class Calculator06 {
	// no global variable here

	// return type parameterized method
	public void addition(int a, int b) { // Parameter
		int total1 = a + b; // local variable
		System.out.println("Addition of a and b is: " + total1);
	}

	// return type parameterized method
	public void subtraction(int a, int b) { // Parameter
		int total2 = a - b; // local variable
		System.out.println("Subtraction of a and b is: " + total2);
	}

	// return type parameterized method
	public void multiplication(int a, int b) {
		int total3 = a * b;
		System.out.println("Multiplication of a & b: " + total3);
	}

	// return type parameterized method
	public void division(int a, int b) {
		int total4 = a / b;
		System.out.println("Division of a & b: " + total4);
	}
	
	public String stName(String firstName, String lastName) { // parameter
		String fullName = firstName + " " + lastName;
		System.out.println("Student Name: " + fullName);
		return fullName;
	}
	
	public void employee(String empName, int empId, char empSex, boolean fullTimeEmployee) {
		System.out.println("The Employee Name is: " + empName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " + fullTimeEmployee); 
	}

}
