package lec13_03_java_oop_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee("Richard M", 80, 'M', false);
		System.out.println("The Employee Name is: " + emp.getName() + ", Employee Age: " + emp.getAge()+", Employee Sex: " + emp.getSex()+" and Is US Citizen? Ans: " +emp.isUsCitizen());

	}

}
