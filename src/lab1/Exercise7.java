package lab1;

import java.util.Scanner;

public class Exercise7 {

	static boolean isIncreasing(int num) {
		int right = num % 10;
		num = num / 10;
		while (num != 0) {
			if (num % 10 > right)
				return false;
			right = num % 10;
			num = num / 10;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if (isIncreasing(n)) {
			System.out.println("Increasing number");
		} else {
			System.out.println("Non increasing number");
		}
		sc.close();
	}
}
