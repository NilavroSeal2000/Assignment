package lab5.com.cg.eis.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary = 0;
		System.out.println("Enter employee Salary: ");
		try {
			salary = sc.nextDouble();
			if (salary < 3000)
				throw new EmployeeException();
			else
				System.out.println("Employee Salary is: " + salary);
		} catch (InputMismatchException e) {
			System.out.println("Enter value properly");
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
