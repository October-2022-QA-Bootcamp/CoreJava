package lec79_java_coding_challenge;

//Que: Write a function to find how many Consonant is present inside the String? 

public class C05_countConsonant {
	
	public static String findConsonant (String s) {
		// you can also convert the String to Upper case [toUpperCase()] and look for vowel
		s = s.toLowerCase();
		// line 12 is not mandatory here
		s = s.replaceAll("\\s", ""); // replacing all white space [\s stands for “whitespace character”]
		// System.out.println(s);
		int count = 0;
		
		for ( int i=0; i<s.length(); i++) {
			// in logical or operator: if one condition is true, then the whole condition is true
			// in logical and operator: if all condition is true, then the whole condition is true
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
				count++;
			}
		}
		System.out.println(count);
		return s;
	}

	public static void main(String[] args) {
		findConsonant("A quick brown fox jumps over the lazy dog");
		findConsonant("Pack my box with five dozen liquor jugs");
		findConsonant("We love Java Coding");
		
		

	}

}
