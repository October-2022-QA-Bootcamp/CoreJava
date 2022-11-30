package lec18_02_Java_Nested_Class;

// Outer Class
public class JFK02 { // Opening of outer Class Body
	// To get access, Inner class must be Instantiated inside outer Class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalFour t4 = new TerminalFour();
	
	// Here is the change
	// method from Outer class
	public void welcome () {
		System.out.println("Welcome to JFK Airport");
		// the inner class object can call their methods inside the outer class method
		t1.destination();
		t2.usAirlines();
		t4.arabianFlights();
	}
	
	// First Inner Class
	public class TerminalOne {
		public void destination () {
			System.out.println("Terminal one is for Saudi Airlines");
		}
	} 
	
	// Second inner class
	public class TerminalTwo {
		public void usAirlines() {
			System.out.println("Terminal two is for Delta International");
		}
	}
	
	// Here is the change
	// Static Nested class
	public static class TerminalFour { 
		public void arabianFlights () {
			System.out.println("Terminal four is for Emirates International");
		}
	} 
	
	
	
	
	
	

} // Closing of outer Class Body
