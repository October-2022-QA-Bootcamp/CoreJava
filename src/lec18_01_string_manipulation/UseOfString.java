package lec18_01_string_manipulation;

import java.util.Arrays;

public class UseOfString {

	public static void main(String[] args) {
		String s = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";
		
		// The Java String class length() method finds the length of a string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s + "\n");
		System.out.println("The length of the String is: " + s.length());
		
		// The java string toUpperCase() method returns the string in upper case letter.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.toUpperCase());
		System.out.println(s); // String is Immutable that's why it's value is not changed
		
		// The java string toLowerCase() method returns the string in lower case letter.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.toLowerCase());
		
		// charAt() -- Returns the char value at the specified index.
		// The index number starts from 0 and goes to n-1, where n is the length of the string. 
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe character at a specific position(0): " + s.charAt(0));
		System.out.println("\nThe character at a specific position(10): " + s.charAt(10));
		System.out.println("\nThe character at a specific position(126): " + s.charAt(126));
		System.out.println("\nThe character at a specific position(211): " + s.charAt(211));
		// System.out.println("\nThe character at a specific position(212): " + s.charAt(212)); // will show StringIndexOutOfBoundsException

		// We can even change the value of variable, no need of mention the variable type
		System.out.println("\n------------------------------------------------------------------------");
		s = "Lorem ipsus pariatur nulla rem ipsum, molestiae ptatem qui ea?";
		System.out.println(s);
		
		System.out.println("\n------------------------------------------------------------------------");
		s = "Lorem ipsum dolora sit amet dolor consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";
		System.out.println(s);
		
		// The Java String class indexOf() method returns the position of the first occurrence of the specified character or string in a specified string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe character 'L' is, at the position of: " + s.indexOf('L')); // String indexing starts from 0
		System.out.println("\nThe character 'V' is, at the position of: " + s.indexOf('V')); 
		System.out.println("\nThe character 'v' is, at the position of: " + s.indexOf('v')); // case sensitive
		System.out.println("\nThe character 'r' is, at the position of: " + s.indexOf('r')); // if present more than one, the first own is recognized
		System.out.println("\nThe character 'x' is, at the position of: " + s.indexOf('x')); // if any character is absent, it shows -1.
		
		// Returns the index within this string of the first occurrence of the specified substring.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe index of 'dolor' word is in : " + s.indexOf("dolor"));
		System.out.println("\nThe index of 'Dolor' word is in : " + s.indexOf("Dolor")); // case sensitive
		System.out.println("\nThe index of 'debitis' word is in : " + s.indexOf("debitis"));
		System.out.println("\nThe index of 'pariatur' word is in : " + s.indexOf("pariatur"));
		
		s = "Lorem ipsum adolor sit amet dolora consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";
		
		// Tough: 01
		// Please see this part carefully
		// To know the position of the repetitive character in which index:
		// s.indexOf('a', s.indexOf('a')+1))
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe first 'r' character is - at the position of: " + s.indexOf('r')); // (2)
		System.out.println("\nThe second 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r')+1)); //
		System.out.println("\nThe third 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r', s.indexOf('r')+2)+1));
		System.out.println("\nThe second 'o' character is - at the position of: " + s.indexOf('o', s.indexOf('o')+1));
		System.out.println("\nThe third 'o' character is - at the position of: " +s.indexOf('o', s.indexOf('o', s.indexOf('o')+2)+1));
		
		// last occurrence of a character by lastIndexOf()
		// The Java String class lastIndexOf() method returns the last index of the given character value or substring.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe last 'r' character is - at the position of: " + s.lastIndexOf('r')); 
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe first dolor String is - at the position of: " + s.indexOf("dolor")); // (2)
		System.out.println("\nThe second dolor String is - at the position of: " + s.indexOf("dolor", s.indexOf("dolor")+1)); //
		
		s = "Lorem ipsum adolor sit amet dolora consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";
		
		// The java string substring() method returns a part of the string.
		// this substring is important
		// Returns a string that is a substring of this string. The substring begins at the specified beginIndex and 
		// extends to the character at index endIndex - 1. Please remember it, here upper limit is excluded
		// Thus the length of the substring is endIndex-beginIndex.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.substring(19)); // begin index 19, end index = last index
		System.out.println(s.substring(19, 25));
		System.out.println(s.substring(19, 65));
		
		// equals() method is used to compare Strings and return a boolean value
		// Returns 'true' if the given object represents a String equivalent to this string, 'false' otherwise
		System.out.println("\n------------------------------------------------------------------------");
		String s1 = "My name is John. ";
		String s2 = "My name is John. ";
		String s3 = "my name is john. ";
		String s4 = "MY NAME IS JOHN. ";
		System.out.println("Is s1 equal to s2? Ans: " + s1.equals(s2));
		System.out.println("Is s1 equal to s3? Ans: " + s1.equals(s3));
		System.out.println("Is s1 equal to s4? Ans: " + s1.equals(s4));
		
		System.out.println("\n------------------------------------------------------------------------");
		// == is used in int
		int i = 20;
		int j = 20;
		int k = 25;
		System.out.println(i==j);
		System.out.println(i==k);
		System.out.println(j==k);
		
		// How about String
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s1==s2);
		System.out.println("Is it True? Ans: " + s1==s2); // Why false? get it? because "xxxxxxx" + s1 is concatenating and then comparing with s2
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		
		s3 = "my name is john. ";
		s4 = "MY NAME IS JOHN. ";
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s3.equals(s4)); // how that can be solved? one way below -
		// Used 2 String method together
		System.out.println(s3.toUpperCase().equals(s4));
		System.out.println(s3.toUpperCase().equals(s4.toUpperCase())); // This is also possible, but complex scenario
		System.out.println(s4.toLowerCase().equals(s3));
			
		s3 = "my name is john. ";
		s4 = "MY NAME IS JOHN. ";
		// Two strings are considered equal ignoring case if they are of the same length
		// and corresponding characters in the two strings are equal ignoring case.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s3.equals(s4)); // how that can be solved? one way below -
		System.out.println(s3.equalsIgnoreCase(s4));
		
		// The java string trim() method eliminates leading and trailing spaces.
		// To avoid white space: trim() -- (remove any leading and trailing whitespace)
		System.out.println("\n------------------------------------------------------------------------");
		String s5 = "         HelloWorld.        ";
		System.out.println("Before Trim: " + s5);
		System.out.println("After Trim: " + s5.trim());
		
		// can't remove white space Between Words
		System.out.println("\n------------------------------------------------------------------------");
		String s6 = "    Hello       World!    ";
		System.out.println("After Trim: " + s6.trim()); // solution at line 167 and 169
		
		// The java string replace() method returns a string replacing all the old char
		// or CharSequence to new char or CharSequence.
		// To replace we use replace() method
		// Returns a string resulting from replacing all occurrences of oldChar in this
		// string with newChar.
		System.out.println("\n------------------------------------------------------------------------");
		String s7 = "Good morning mr";
		System.out.println("After replacing by Character: " + s7.replace('m', 'M'));
		System.out.println("After replacing by String: " + s7.replace("mr", "Sir"));

		// replace() can't trim
		System.out.println("\n------------------------------------------------------------------------");
		String s8 = "      GooD Morning      ";
		System.out.println("After replaing: " + s8.replace('D', 'd'));
		// using trim() and replace () together
		System.out.println("After triming and replacing: " + s8.trim().replace('D', 'd'));
		
		System.out.println("\n------------------------------------------------------------------------");
		String s9 = "      Good    MoRning      ";
		System.out.println("After triming and replacing: " + s9.trim().replace("    MoR", " Mor"));
		s6 = "    Hello       World!    ";
		System.out.println("After triming and replacing: " + s6.trim().replace("       ", " "));
		// or
		System.out.println("After triming and replacing: " + s6.trim().replace("    World!", " World!"));
		
		s5 = "         HelloWorld.        ";
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("After triming and replacing: " + s5.trim().replace('.', '!'));
		
		System.out.println("\n------------------------------------------------------------------------");
		String s10 = "Hello! Let's learn together";
		System.out.println("After replacing a word: " + s10.replace("Hello!", "Welcome to Java."));
		
		System.out.println("\n------------------------------------------------------------------------");
		String dateOfToday = "11/27/2022"; // very much used
		System.out.println("After replacing: " + dateOfToday.replace('/', '-'));
		
		s10 = "Hello! Let's learn together";
		// The java string replaceAll() method returns a string replacing all the
		// sequence of characters matching regex and replacement string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("After replacing all, the complete String is: " + s10.replaceAll(s10, "Hey Hey captian!"));
		
		// regular way of concatenation
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("Hello" + " World!");
		System.out.println(s1 + s10);

		// Concatenation
		// The Java String class concat() method combines specified string at the end of
		// this string. It returns a combined string.
		System.out.println("\n------------------------------------------------------------------------");
		String s11 = "My name is ";
		String s12 = "Tofael";
		System.out.println(s11.concat(s12));
		
		System.out.println("\n------------------------------------------------------------------------");
		// How to write Array: first data type, then [] called container, student (OBJECT) is the name of Array, [4] represent total 4 data is present
		String [] student = new String [4];
		student[0] = "Apu Khan";
		student[1] = "Mahmuda Arif";
		student[2] = "Ngwang";
		student[3] = "Numan";
		System.out.println(student[3]); // How to execute, same for below
		
		//or
		String [] mentor =  {"Raihan Khan", "Sazzad", "Rayhan Rahman", "Fatema Khaleda", "Nayon Sarker"};
		int [] age = {33, 78, 21, 29};
		char [] sex = {'M', 'M', 'M', 'F', 'M'};
		
		// Tough: 2, will be used for Java coding challenge, very very important
		// how to convert a String to Character, we use toCharArray()
		String str1 = "Mr owl ate my metal worm";
		// char is array type, [] = container, characterByCharacter = name of the Array
		char [] characterByCharacter = str1.toCharArray();
		// System.out.println(characterByCharacter); // This will not show correct outcome, because Arrays class is needed for Array manipulation
		// Arrays is a class, need to import and used to manipulate Array. you can't print Array without help of Arrays class
		System.out.println(Arrays.toString(characterByCharacter)); 
		
		//Please see line 204-225 for next method
		// Tough: 3, will be used for Java coding challenge, very very important
		 // in short, split method convert a String to a String Type Array
		String str2 = "Mr owl ate my metal worm";
		String [] words = str2.split(" "); 
		System.out.println(Arrays.toString(words));
		
		// The Java String class contains() method searches the sequence of characters in this string. This is used as method in many places
		System.out.println("\n ------------------------------------------------------------------------");
		String s13 = "How much you know about Java";
		System.out.println(s13.contains("How much y"));
		System.out.println(s13.contains("How much z"));
		System.out.println(s13.contains("about"));
		System.out.println(s13.contains("hello"));
		System.out.println(s13.contains("Java"));
		
		// The java string startsWith() method checks if this string starts with given prefix.
		System.out.println("\n ------------------------------------------------------------------------");
		String s14 = "java by Oracle";
		System.out.println(s14.startsWith("j"));
		System.out.println(s14.startsWith("J")); 
		System.out.println(s14.startsWith("java"));
		System.out.println(s14.startsWith("Nava"));
		
		// The Java String class endsWith() method checks if this string ends with a given suffix.
		System.out.println("\n ------------------------------------------------------------------------");
		System.out.println(s14.endsWith("e"));
		System.out.println(s14.endsWith("E")); 
		System.out.println(s14.endsWith("oraclE"));
		System.out.println(s14.endsWith("Oracle"));
		
		// The Java String class isEmpty() method checks if the input string is empty or not.
		System.out.println("\n ------------------------------------------------------------------------");
		String s15 = "";
		String s16 = "Java";
		System.out.println(s15.isEmpty());
		System.out.println(s16.isEmpty());
		
		// The java string valueOf() method converts different types of values into string.
		// how to turn int, float etc. to String
		System.out.println("\n ------------------------------------------------------------------------\n");
		int age1 = 30;
		String s17 = String.valueOf(age1);
		System.out.println(s17); // what is the proof, it is turned to a String
		System.out.println(s17 + 10); 
		
		// Not important
		// This is not important from here
		/*
		 * The compareTo() method returns 0 if the two strings are equal, a number less than 0 if the first String is larger, 
		 * and a number greater than 0 if the second String is larger. Uppercase letters come before lowercase letters when 
		 * the method compares strings. As you work through learning this method's function,  use the ascii table to see how far apart the characters are from each other.
		 */
		// The Java String class compareTo() method compares the given string with the
		// current string lexicographically. It returns a positive number, negative number, or 0.
		
		System.out.println("------------------------------------------------------------------------\n");
		
		String s18 = "hello";
		String s19 = "meklo";
		String s20 = "hemlo";
		String s21 = "flag";
		String s22 = "hello";
		String s23 = "Hello"; // every character have a value based on ASCII Table, h=104, H=72
		System.out.println(s18.compareTo(s22)); // 0 because both are equal
		System.out.println(s18.compareTo(s19)); // -5 because "h" is 5 times lower than "m"
		System.out.println(s18.compareTo(s20)); // -1 because "l" is 1 times lower than "m"
		System.out.println(s18.compareTo(s21)); // 2 because "f" is 2 times lower than "h"
		System.out.println(s18.compareTo(s23)); // every character have a value based on ASCII Table, h=104, H=72
				
		

		
		
		
		
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
