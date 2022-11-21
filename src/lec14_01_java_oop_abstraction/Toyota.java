package lec14_01_java_oop_abstraction;


// A Regular Class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword

public class Toyota extends Mercedez implements Car, Drone {
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

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carryingPassenger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carryingGoods() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void lightWeight() {
		// TODO Auto-generated method stub
		
	}

	
	
	// Default methods are allowed only in interfaces, not in regular class
	/*
	public default void toyotaColor () {
		
	}
	*/
	
	
	

}
