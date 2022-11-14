package lec12_02_java_oop_abstraction;

// Interface is a Blueprint of Class. 
// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

public interface Car {
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
	public void brake();
	// I am not initializing interface today

}
