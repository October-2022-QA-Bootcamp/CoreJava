package lec05_02_java_constructor_final;

public class EmployeeTest {

	public static void main(String[] args) {
		// Default Constructor Initialized
		Employee emp01 = new Employee();
		// Parameterized Constructor Initialized
		Employee emp02 = new Employee("Mohammad Sharkar", 2188458, 'M', true);
		Employee emp03 = new Employee("Mohammad Hussain", 2165258, 'M', false);
		Employee emp04 = new Employee("Nargis Sultana", 8165258, 'F', true);
	}
}