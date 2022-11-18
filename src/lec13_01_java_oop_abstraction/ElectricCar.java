package lec13_01_java_oop_abstraction;


// Abstract Class contains both abstract and non abstract methods
// Abstract Class names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Abstract Class --> ElectricCar
// Snake_case example for an Abstract Class --> Electric_car

// An abstract class can inherit only one abstract class or one regular class by extends key word
// An abstract class can't inherit an Interface by extends key word
public abstract class ElectricCar extends FlyingCar{
	// Interview question: Can we create/initialize or declared variables inside Abstract class?
	public String nameOfElectricCar = "Tesla";	
	public int costOfTesla = 65000;
	
	// Can you Declare a Constructor inside Abstract class?
	// Yes
	public ElectricCar () {
		System.out.println("This constructor is from Abstract class-- Electric Car");
	}	
	// Interview question: Can a Constructor of an Abstract class be initialized?
	// When we will initialize, we will get that answer that time
	
	// method implemented
	// non-abstract method
	public void battery () {
		System.out.println("The Battery is very efficient, from Electric Car class");
	}
	
	// method declared
	// when method is declared, that method is also called abstract method
	// This is mandatory to put abstract keyword with the abstract method inside Abstract Class
	// This is the norm/rules to write at least one abstract method inside abstract class
	public abstract void price();
	
	public abstract String carName();
	
	// static method can be used inside abstract class
	public static void yearEstablished() {
		System.out.println("Established in 2018");
	}
	
	// Default methods are allowed only in interfaces, not in abstract class
	/*
	public default void noGas() {
		
	}
	*/
	
	
	

}
