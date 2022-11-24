package lec16_02_string_manipulation;

public class UseOfString {

	public static void main(String[] args) {
		String s = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";
		
		// The Java String class length() method finds the length of a string.
		System.out.println("\n ------------------------------------------------------------------------\n");
		System.out.println(s + "\n");
		System.out.println("The length of the String is: " + s.length());
		
		// The java string toUpperCase() method returns the string in upper case letter.
		System.out.println("\n ------------------------------------------------------------------------\n");
		System.out.println(s.toUpperCase());
		System.out.println(s); // String is Immutable that's why it's value is not changed
		
		// The java string toLowerCase() method returns the string in lower case letter.
		System.out.println("\n ------------------------------------------------------------------------\n");
		System.out.println(s.toLowerCase());
		
		// charAt() -- Returns the char value at the specified index.
		// The index number starts from 0 and goes to n-1, where n is the length of the string. 
		System.out.println("\n ------------------------------------------------------------------------");
		System.out.println("\nThe character at a specific position(0): " + s.charAt(0));
		System.out.println("\nThe character at a specific position(10): " + s.charAt(10));
		System.out.println("\nThe character at a specific position(126): " + s.charAt(126));
		// System.out.println("\nThe character at a specific position(212): " + s.charAt(212)); // will show StringIndexOutOfBoundsException

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
