package lec03_java_variables;

// Projects names generally starts with UpperCase --> October2022CoreJava
// Package names are generally starts with lowerCase --> j01JavaBasic
// Class names starts with UpperCase. Class names are usually nouns or noun phrases --> NamingConvention

// Project, package, class follow Camel case or Snake case pattern.
// Camel case feature considered from second word, not from first word
// Camel case example for a project --> October2022CoreJava
// Camel case example for a package --> jv01JavaBasic
// Camel case example for a class --> NamingConvention

// Alternative example of Camel case (Called snake_case).
// Snake case feature considered from second word, not from first word like Came case feature
// Snake case example for a project --> October_2022_core_java
// Snake case example for a package --> jv_01_java_basic
// Snake case example for a class --> Naming_convention

public class C_namingConvention {
	// Non-constant (Regular) variable (field) names starts with lowerCase
	// variable names must be specific and meaningful
	// (variable name) no duplication is accepted inside the same class
	
	// public is an access modifier, int is the type of variable, houseNumber is the name of the variable
	public int houseNumber = 625; // variable initialized
	public int avenueNumber; // variable declared
	
	// Constant names are written with all upper case letters with words separated by underscores
	// We will use it in automation framework, no need to worry about it right now
	public String WEDDING_REGISTRY_PAGE_TITLE = "Amazon Wedding";
	public int LONG_WAIT = 10;
	
	// names like "string1, myarray1, no_1" are not acceptable as variable names
	// because they are are not specific and can cause confusion like the variable below:
	public String string = "String"; // not appreciated

	public static void main(String[] args) {
		System.out.println("This is all about Naming Convention");

	}

}
