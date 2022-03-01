package lab5;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	   /**
	 * This is a user defined exception
	 */
	private static final long serialVersionUID = 1L;
	String s1;
	   InvalidAgeException(String s2) {
	      s1 = s2;
	   } 
	   @Override
	   public String toString() { 
	      return ("InvalidAgeException : "+s1);
	   }
	}


public class Exercise1 {
	public static void validate(int age) throws InvalidAgeException {
		if (age < 15) {
			throw new InvalidAgeException("Age can not be below 15");
		} else
			System.out.println("Age approved!");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		try {
			int age = sc.nextInt();
			validate(age);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		} finally {
			System.out.println("End of program");
		}
		sc.close();
	}
}
