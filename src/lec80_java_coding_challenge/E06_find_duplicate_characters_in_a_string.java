package lec80_java_coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class E06_find_duplicate_characters_in_a_string {

	public static void main(String[] args) {

		// see next one is better
		String str = "a beautiful beach bob";
		int count = 0;
		// We remove the white space by below line
		// where \\s is a single space in unicode
		str = str.replaceAll("\\s", "");
		// System.out.println(str); // This line not needed, just for clarification
		char[] charArray = str.toCharArray();
		// System.out.println(Arrays.toString(charArray)); // This line not needed, just
		// for clarification

		Set<Character> moreThanOne = new HashSet<>();

		for (int i = 0; i < charArray.length; i++) { // a
			for (int j = i + 1; j < charArray.length; j++) { // b, e, a, u, t, i, f, u, l, b, e, a, c, h, b, o, b
				if (charArray[i] == charArray[j]) {
					count++; // this is giving us a duplication count
					moreThanOne.add(charArray[j]);
				}
			}

		}
		System.out.println("The character present more than one are: " + moreThanOne);
		System.out.println("How many duplication occured? Ans:: " + count);

	}

}
