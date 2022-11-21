package lec14_03_java_basic;

public class Employee3 {	
	public static String empName = "Tofael";
	public static int empId = 2188458;
	public static char sex = 'M';
	public static boolean fullTimeEmployee = true;
	
	public static void employee() {
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Sex: " + sex
				+ " and Full time Employee? Ans: " + fullTimeEmployee);
	}
	
	public static void main(String[] args) {
		employee();

	}

}