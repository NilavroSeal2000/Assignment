package lab1;

import java.util.Scanner;

public class Exercise1 {

	static int cube_sum(int num) {
		int total = 0;
		while (num != 0) {
			int last_digit = (num % 10);
			total += last_digit * last_digit * last_digit;
			num = num/10;
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int result = Exercise1.cube_sum(n);
		System.out.println("Some of Cube of the digit is: "+result);
		sc.close();
	}
}
