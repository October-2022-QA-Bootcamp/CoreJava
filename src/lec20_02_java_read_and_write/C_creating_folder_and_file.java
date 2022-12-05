package lec20_02_java_read_and_write;

import java.io.File;
import java.io.IOException;

public class C_creating_folder_and_file {

	public static void main(String[] args) {
		// Creating Folder
		// for Mac user -- go to the properties -- if the folder name is Alex -- /Users/YourName/Desktop/Alex
		File folder = new File ("C:\\Users\\Tofael\\Desktop\\EnthrallIT");
		folder.mkdir(); // this method make directory or folder and this is coming from File class
		
		if (folder.exists()) {
			System.out.println(folder.getName() + " folder is created");
			// Creating file
			File file = new File("C:\\Users\\Tofael\\Desktop\\EnthrallIT\\October2022.txt");
			// An exception can occur during creation of a file
			// IOException is the base class for exceptions thrown while accessing information using streams,
			// files and directories. 
			try {
				file.createNewFile();			
			} catch (IOException e) {
				System.out.println("The new file is not created and the exception is: >>>>>> " + e);
			}
			
			if (file.exists()) {
				System.out.println(file.getName() + " file is created inside Enthrall IT Directory");
			} else {
				System.out.println("Exception Occured, file is not generated");
			}
	
		} else {
			System.out.println("Folder is not Created");
		}
		
	}

}
