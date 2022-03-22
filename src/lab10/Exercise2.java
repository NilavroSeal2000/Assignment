package lab10;

import java.io.*;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file name:");
		String file_name = sc.nextLine();
		File f = new File("C:\\Users\\Nilavro\\Desktop\\");
		if (f.exists())
			System.out.println(file_name + " exists");
		else
			System.out.println(file_name + " does not exist");
		if (f.exists()) {
			if (f.canRead())
				System.out.println(file_name + " is readable");
			else
				System.out.println(file_name + " is not readable");
			if (f.canWrite())
				System.out.println(file_name + " is writeable");
			else
				System.out.println(file_name + " is not writeable");
			System.out.println("The file type is: " + file_name.substring(file_name.indexOf('.') + 1));
			System.out.println("The Length of the file:" + f.length());
		}
		sc.close();
	}
}