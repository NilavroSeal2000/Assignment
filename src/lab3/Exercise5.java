package lab3;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a paragraph: ");
		String para = sc.nextLine();
		System.out.println("Number of characters: " + para.length());
		System.out.println("Number of lines: " + occurance(para, '.'));
		System.out.println("Number of words " + occurance(para, ' ')+1);
		sc.close();
	}

	private static int occurance(String para, char c) {
		int total = 0;
		for (int i = 0; i < para.length(); i++) {
			if (para.charAt(i) == c)
				total++;
		}
		return total;

	}
}
