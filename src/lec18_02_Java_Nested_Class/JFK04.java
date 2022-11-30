package lec18_02_Java_Nested_Class;

// Outer Class
public class JFK04 { // Opening of outer Class Body
	// To get access, Inner class must be Instantiated inside outer Class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalFour t4 = new TerminalFour();
	
	// Here is the change
	// method from Outer class
	public void welcome () {
		System.out.println("Welcome to JFK Airport");
	}
	
	// First Inner Class	
	public class TerminalOne {
		public void destination () {
			System.out.println("Terminal one is for Saudi Airlines");
			// Here is the change
			welcome(); // inner class method can access the outer class method directly, no object required
			// You can also call other inner classes methods, even the static one, see line 24
			t2.usAirlines();
			t4.arabianFlights();
			TerminalFour.asianFlights();		
		}
	} 
	
	// Second inner class
	public class TerminalTwo {
		public void usAirlines() {
			System.out.println("Terminal two is for Delta International");
		}
	}
	
	// Static Nested class
	public static class TerminalFour { 
		// non static method
		public void arabianFlights () {
			System.out.println("Terminal four is for Emirates International");
		}
		// static method
		public static void asianFlights() {
			System.out.println("Terminal four is also for Thai International");
		}
		
		
	} 
	
	
	
	
	
	

} // Closing of outer Class Body
