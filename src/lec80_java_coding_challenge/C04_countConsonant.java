package lec80_java_coding_challenge;

//Que: How many vowel is in the String? Vowel: a, e, i, o, u
// see line 23
public class C04_countConsonant {

	public static void main(String[] args) {
		String s = "Pack my box with five dozen liquor jugs";
		// you can also convert the String to Upper case [toUpperCase()] and look for vowel
		s = s.toLowerCase();
		// line 12 is not mandatory here, but for C02 Class must
		s = s.replaceAll("\\s", ""); // replacing all white space [\s stands for “whitespace character”]
		int count = 0;
		
		for ( int i=0; i<s.length(); i++) {
			// in logical or operator: if one condition is true, then the whole condition is true
			// in logical and operator: if all condition is true, then the whole condition is true
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				count++;
			}
		}
		// But not a good and smart approach
		System.out.println(s.length()-count);
		// Interviewer don't like the arithmetic expression for coding challenge
	}

}
