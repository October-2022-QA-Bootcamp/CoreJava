package lec09_02_Java_Interface_Class_and_AbstractClass;

// Interface is a Blueprint of Class. 
// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

public interface Car {
	// in Interface, method declared, not implemented
	// the method which are declared -- called also abstract method
	// This is not mandatory to put abstract keyword with the abstract method inside Interface
	public void start();
	public abstract void stop();
	public void brake();
	// I am not initializing interface today

}
