package lab1;

import java.util.Scanner;

public class Exercise4 {

	static boolean isPrime(int n) {
		if (n < 2)
			return false;
		else {
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
		sc.close();
	}
}
