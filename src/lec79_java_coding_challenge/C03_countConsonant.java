package lec79_java_coding_challenge;

//Que: How many Consonant is in the String? Vowel: a, e, i, o, u, the rest is consonant
// Change in line 21 end, and line 13
public class C03_countConsonant {

	public static void main(String[] args) {
		String s = "A quick brown fox jumps over the lazy dog";
		// you can also convert the String to Upper case [toUpperCase()] and look for vowel
		s = s.toLowerCase();
		// line 12 is not mandatory here
		s = s.replaceAll("\\s", ""); // replacing all white space [\s stands for “whitespace character”]
		// In line 12, we can use " " instead of "\\s", it works
		// System.out.println(s);
		int count = 0;
		
		for ( int i=0; i<s.length(); i++) {
			// in logical or operator: if one condition is true, then the whole condition is true
			// in logical and operator: if all condition is true, then the whole condition is true
			// see last condition
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'  && s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
