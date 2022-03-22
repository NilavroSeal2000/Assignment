package lab9b;

import java.util.Scanner;

class Operation {
	int factorial(int n) {
		if (n == 1 || n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}
}

interface if2 {
	int fact(int m);
}

public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		if2 p = op::factorial;
		System.out.println("Enter a number to find factorial: ");
		int n = sc.nextInt();
		System.out.println("Result: " + p.fact(n));

	}

}
