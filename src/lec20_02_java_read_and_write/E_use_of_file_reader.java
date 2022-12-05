package lec20_02_java_read_and_write;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class E_use_of_file_reader {

	public static void main(String[] args) {
		String path = "C:\\Users\\Tofael\\Desktop\\EnthrallIT\\October2022.txt";
		// Why throws is not working? Please remind me
		try {
			FileReader fileReader = new FileReader(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("FileReader find the location of the path as: " + path);
		// if FileReader can read/recognize the file in path, the above line will be executed
		
		// is the below code executing?
		int a = 12;
		int b = 10;
		int addition = a + b;
		System.out.println("The addition of a and b is: " + addition);
		
		
	}

}
