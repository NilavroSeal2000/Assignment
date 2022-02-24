package lab1;

import java.util.Scanner;

public class Exercise6 {

	public static int calculateDifference1(int n) {
		int total = 0, squaretotal = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
			squaretotal += i * i;
		}

		return total * total - squaretotal;
	}

	public static int calculateDifference2(int n) {
		int total = n * (n + 1) / 2;
		int sqtotal = n * (n + 1) * (2 * n + 1) / 6;
		return total * total - sqtotal;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a natural number: ");
		int n = sc.nextInt();
		System.out.printf(
				"The difference between the sum of the squares of the first %d natural numbers and the square of their sum is : %d\n",
				n, calculateDifference1(n));
		System.out.printf(
				"The difference between the sum of the squares of the first %d natural numbers and the square of their sum is : %d",
				n, calculateDifference2(n));
		sc.close();
	}
}