package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File F = new File("F:/File Handling/Emp.dat");

		FileInputStream fis = new FileInputStream(F);

		ObjectInputStream oos = new ObjectInputStream(fis);

		@SuppressWarnings("unchecked")
		ArrayList<Employee> list = (ArrayList<Employee>) oos.readObject();

		Iterator<Employee> itr = list.iterator();

		while (itr.hasNext()) {

			Employee e = itr.next();

			System.out.println(e.id + " " + e.name + " " + e.salary + " " + e.pincode);
		}
	}

}
