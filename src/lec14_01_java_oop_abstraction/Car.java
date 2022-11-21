package lec14_01_java_oop_abstraction;

// Interface is a Blueprint of Class. 
// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

// An Interface can't inherit a regular class or an abstract class by extends keyword
// An Interface can inherit more than one Interface (separated by coma) by extends keyword

// implements keyword can't be used for inheritance inside Interface

public interface Car extends Taxi, Truck {
	// Interview question: Can we declare variables inside Interface? 
	// No, we have to initialize
	// what is the feature of variable that can be used?
	// the variables inside Interface are final and static in nature.
	public static final int INVENTED = 1800;
	
	// Interview question: Does Interfaces have constructors?
	// Ans: Interfaces cannot have constructors
	
	/*
	public Car () {
		
	}
	*/
	
	// in Interface, method declared, not implemented
	// the method which are declared -- called also abstract method
	// This is not mandatory to put abstract keyword with the abstract method inside Interface
	public void start();
	public abstract void stop();
	public String brake();
	// I am not initializing interface today
	
	// from Java 1.8, JAVA implemented static and default type method in interface	which are implemented
	// important interview question
	
	public default void honk () { // this default is not access modifier, also we can make it return type
		System.out.println("Honk Feature from Car Interface");
	}
	
	public static void gear () {
		System.out.println("Gear Feature from Car Interface");
	}
	
	// not important here, just used, can ignore
	public default String honk1() { 
		System.out.println("Honk Feature from Car Interface");
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
