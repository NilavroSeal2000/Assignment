package lab1;

import java.util.Scanner;

public class Exercise3 {

	public static int fibo_recursion(int n) {
		if (n < 3)
			return 1;
		else
			return fibo_recursion(n - 1) + fibo_recursion(n - 2);
	}

	public static int fibo_iteration(int n) {
		if (n < 3)
			return 1;
		else {
			int num1 = 1;
			int num2 = 1;
			int num = num1 + num2;
			for (int i = 3; i <= n; i++) {
				num1 = num2;
				num2 = num;
				num = num1 + num2;
			}
			return num2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term no: (positive number) ");
		int n = sc.nextInt();
		System.out.println(n + " th Fibonacci through Recursion is: " + fibo_recursion(n));
		System.out.println(n + " th Fibonacci through Iteration is: " + fibo_iteration(n));
		sc.close();
	}

}
