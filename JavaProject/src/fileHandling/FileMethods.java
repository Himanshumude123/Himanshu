package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args) throws IOException {


		File f = new File("F:/File1.txt");
		
		f.createNewFile();
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		
		// f.setWritable(true);
		System.out.println(f.canWrite());
		File f2 = f.getCanonicalFile();
		String s = f2.getAbsolutePath();
		
		System.out.println(s);
		System.out.println(f.exists());
		String s1 = f.getParent();
		
		System.out.println(s1);

		// f.setWritable(false, true);
		System.out.println(f.canWrite());

	}
}
