package lab9b;

import java.util.Scanner;

@FunctionalInterface
interface multi {
	public int power(int a, int b);
}

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		multi s = (a, b) -> (int) Math.pow(a, b);

		System.out.println("Enter two number: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(s.power(n1, n2));
		sc.close();
	}

}
