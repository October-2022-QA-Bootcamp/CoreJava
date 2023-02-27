package lec80_java_coding_challenge;

//This code is not correct, so I am showing how?

public class E02_findStringWhichPresentMoreThanOneWrong {

	public static void main(String[] args) {
		// Here language is an String type Array.
		String [] language = { "Java", "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++" };
		
		// This coding is not 100% correct, follow the next one
		for (int i = 0; i < language.length; i++) { // Java
			
			for (int j = i+1; j<language.length; j++) { // "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++" 
				
				if (language[i].equals(language[j])) {
					System.out.println(language[i]);
				}
				
			}
		}
		
		

	}

}
