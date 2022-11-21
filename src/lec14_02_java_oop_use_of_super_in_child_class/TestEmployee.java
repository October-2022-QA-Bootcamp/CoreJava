package lec14_02_java_oop_use_of_super_in_child_class;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("---------- default constructor initialized from Employee Class ----------");
		Employee employee1 = new Employee();
		
		System.out.println("\n---------- parameterized constructor initialized from Employee Class ----------");
		Employee employee2 = new Employee("Tofael", 2188458, 'M', true);
		
		System.out.println("\n---------- void type method initialized from Employee Class ----------");
		employee2.empInfo();
		
		System.out.println("\n---------- parameterized method initialized from Employee Class ----------");
		employee2.employeeInfo("Ahsan", 76830, 'M', false);
		
		System.out.println("\n---------- default constructor initialized from MountSinai Class ----------");
		MountSinai mountSinai1 = new MountSinai();
		
		System.out.println("\n---------- parameterized constructor initialized from MountSinai Class ----------");
		MountSinai mountSinai2 = new MountSinai("Manhattan", 5);
		
		System.out.println("\n---------- void type method initialized for MountSinai Class ----------");
		mountSinai2.msInfo();
		
		System.out.println("\n---------- parameterized method initialized for MountSinai Class ----------");
		mountSinai2.mountSinaiInfo("Queens", 4);		
		
		
	}

}
