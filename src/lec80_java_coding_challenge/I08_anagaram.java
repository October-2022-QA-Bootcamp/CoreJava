package lec80_java_coding_challenge;

import java.util.Arrays;

/*
Interview Question:
Write a Java Program to check if the two String are Anagram. 
Two String are called Anagram when there is same character but in different order.
For example,"CAT" and "ACT", "ARMY" and "MARY", "RACECAR" and  "RRAACCE", "MALAYALAM" and "MALAYALAM"
SO, A Palindrome word can be anagram too
*/

public class I08_anagaram {
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		char [] charArray1 = str1.toCharArray();
		Arrays.sort(charArray1);
		char [] charArray2 = str2.toCharArray();
		Arrays.sort(charArray2);
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("ARMY", "MARY"));
		System.out.println(isAnagram("RACECAR", "RRAACCE"));
		System.out.println(isAnagram("ENTHRALL", "mentholl"));

	}

}
