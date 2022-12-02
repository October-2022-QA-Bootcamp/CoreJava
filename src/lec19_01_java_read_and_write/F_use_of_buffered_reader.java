package lec19_01_java_read_and_write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F_use_of_buffered_reader {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "C:\\Users\\Tofael\\Desktop\\EnthrallIT\\October2022.txt";
		// Why throws is not working? Please remind me
		FileReader fileReader = new FileReader(path);
		System.out.println("FileReader find the location of the path as: " + path);
		// if FileReader can read/recognize the file in path, the above line will be executed
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String data = " ";
		try {
			while((data = bufferedReader.readLine()) != null) {
				System.out.println("The BufferedReader read the file and got:  " + data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
