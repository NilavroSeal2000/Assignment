package lab3;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to check postive word or not: ");
		String word = sc.next();
		if (checkPositive(word))
			System.out.println("Positive word");
		else
			System.out.println("Not a Positive word");
		sc.close();
	}

	private static boolean checkPositive(String word) {
		for (int i = 0; i < word.length() - 1; i++) {
			if (word.charAt(i) > word.charAt(i + 1))
				return false;
		}
		return true;
	}
}
