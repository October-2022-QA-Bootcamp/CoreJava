package lec09_02_Java_Interface_Class_and_AbstractClass;

//Abstract Class names starts with UpperCase 
//They follow Camel case or Snake case pattern.
//CamelCase or Snake_case feature considered from second word, not from first word
//CamelCase example for an Abstract Class --> CarToyota
//Snake_case example for an Abstract Class --> Car_toyota

public abstract class ElectricCar {
	
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

}
