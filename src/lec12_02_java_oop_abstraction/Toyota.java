package lec12_02_java_oop_abstraction;

// A Regular Class
public class Toyota {
	public int yearOfManufacture = 1885; // Global variable
	
	public Toyota () {
		System.out.println("This constructor is from Toyota class");
	}
	
	// method is implemented inside class (not declared)
	// also called void type non-abstract method
	public void toyotaInfo () {
		System.out.println("This method is from Toyota Class");
	}
	
	// return type non-abstract methods also can be used 
	public int toyotaPrice() {
		int price = 45000; // local variable
		System.out.println(price);
		return price;
	}

}
