package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileAssignment {

	public static void main(String[] args) {

		String input = "F:/File Handling/File1.txt";

		String output = "F:/File Handling/File2.txt";

		try {

			FileInputStream f = new FileInputStream(input);
			FileOutputStream fos = new FileOutputStream(output);

		   // byte[] byt = new byte[f.available()];
		    
		    

			int readFile;

			while ((readFile = f.read()) != -1) {

				fos.write((char) readFile);
			}

			System.out.println("File Copid Successfully....!");

		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
