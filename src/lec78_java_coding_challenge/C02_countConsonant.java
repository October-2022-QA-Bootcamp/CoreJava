package lec78_java_coding_challenge;

//Que: How many Consonant is in the String? Vowel: a, e, i, o, u, the rest is consonant

public class C02_countConsonant {

	public static void main(String[] args) {
		String s = "A quick brown fox jumps over the lazy dog";
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

	}

}
