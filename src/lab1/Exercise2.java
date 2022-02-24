package lab1;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice...");
		System.out.println(" 1. RED\n 2. YELLOW\n 3. GREEN");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Stop!");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go.");
			break;
		default:
			System.out.println("Wrong choice!");
		}
		sc.close();
	}
}
