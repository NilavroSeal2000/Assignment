package lab5;

import java.util.Scanner;

class InvalidNameException extends Exception {
	/**
	 * This is a user defined exception
	 */
	private static final long serialVersionUID = 1L;
	String s1;

	InvalidNameException(String s2) {
		s1 = s2;
	}

	@Override
	public String toString() {
		return ("InvalidNameException : " + s1);
	}
}

public class Exercise2 {
	public static void validate(String name) throws InvalidNameException {
		if (name.contains(" ") && name.length() > 5) {
			System.out.println("Name approved!");
		} else
			throw new InvalidNameException("The name must have firstname and second name");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		try {
			String name = sc.nextLine();
			validate(name);
		} catch (InvalidNameException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("End of program");
		}
		sc.close();

	}
}
