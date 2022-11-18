package lec13_01_java_oop_abstraction;


// A Regular Class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword
public class Toyota extends Mercedez {
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
	
	// static method can be used inside regular class 
	public static void countryOfOrigin() {
		System.out.println("Made in Japan");
	}
	
	// Default methods are allowed only in interfaces, not in regular class
	/*
	public default void toyotaColor () {
		
	}
	*/
	
	
	

}
