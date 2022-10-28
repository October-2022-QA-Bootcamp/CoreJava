package lec05_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// When class is instantiated, means when object is created, Constructor is Initialized
		// Default Constructor Initialized
		// If you put below line outside main method, what is the outcome? no execution.
		// Why?
		Employee employee1 = new Employee();
		// Here "Mohammad Sharkar" is an argument,
		// in Employee class, empName was a parameter and that is String type
		// Parameterized Constructor 01 is initialized
		Employee employee2 = new Employee("Mohammad Sharkar");
		// Parameterized Constructor 02 is initialized
		Employee employee3 = new Employee("Mohammad Sharkar", 2188458);
		// Parameterized Constructor 03 is initialized
		Employee employee4 = new Employee("Mohammad Sharkar", 2188458, 'M');
		// Parameterized Constructor 04 is initialized
		Employee employee5 = new Employee("Mohammad Sharkar", 2188458, 'M', true);
		// Parameterized Constructor 05 is initialized
		// We can initialize a parameter more than one time by creating different object
		Employee employee6 = new Employee("Alex", 1188458, true, 'M');
		Employee employee7 = new Employee("Nuzaira", 4188458, false, 'F');
		Employee employee8 = new Employee("Tanvir", 2198458, false, 'M');
		Employee employee9 = new Employee("Mahmoda", 9188458, true, 'F');
	}
}