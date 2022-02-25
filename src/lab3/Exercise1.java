package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integers saperated by space:");

		String input = sc.nextLine();

		StringTokenizer tokenizer = new StringTokenizer(input);

		System.out.println(input);

		int num = 0, sum = 0;

		while (tokenizer.hasMoreTokens()) {
			String str = tokenizer.nextToken();
			num = Integer.parseInt(str);
			//System.out.println(num);
			sum = num + sum;
		}
		System.out.println("Sum is: " + sum);

		sc.close();
	}
}